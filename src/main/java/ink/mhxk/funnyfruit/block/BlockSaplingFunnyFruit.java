package ink.mhxk.funnyfruit.block;

import java.util.List;
import java.util.Random;

import ink.mhxk.funnyfruit.init.ModBlockLoader;
import ink.mhxk.funnyfruit.init.ModCreativeTabLoader;
import ink.mhxk.funnyfruit.util.ModWorldGenTrees;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;

public class BlockSaplingFunnyFruit 
extends BlockBush
implements IGrowable{
	protected static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);
	public BlockSaplingFunnyFruit() {
		this.setCreativeTab(ModCreativeTabLoader.FUNNY_FRUIT);
	}
	
	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
		
		return true;
	}

	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		return worldIn.rand.nextFloat()<0.45D;
	}

	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		
        if (!worldIn.isRemote && TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
            WorldGenerator worldgenerator = new ModWorldGenTrees(
                    true,
                    4,
                    ModBlockLoader.LOG_FUNNY_FRUIT.getDefaultState(),
                   ModBlockLoader.LEVEL_FUNNY.getDefaultState(),
                   	ModBlockLoader.LEVEL_FUNNY_FRUIT.getDefaultState(),
                    false);
            IBlockState iblockstate2 = Blocks.AIR.getDefaultState();
            int i = 0;
            int j = 0;

            worldIn.setBlockState(pos, iblockstate2, 4);
            if (!worldgenerator.generate(worldIn, rand, pos.add(i, 0, j))) {
                worldIn.setBlockState(pos, state, 4);
            }
        }
	}
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return SAPLING_AABB;
	}
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		String lore = I18n.format("goldenFunnyFruit.desc.1");
		String lore2 = I18n.format("goldenFunnyFruit.desc.2");
		String lore3 = I18n.format("goldenFunnyFruit.desc.3");
		String lore4 = I18n.format("goldenFunnyFruit.desc.4");
		tooltip.add(lore);
		tooltip.add(lore2);
		tooltip.add(lore3);
		tooltip.add(lore4);
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	@Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            super.updateTick(worldIn, pos, state, rand);

            if (!worldIn.isAreaLoaded(pos, 1)) return;
            if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0)
            {
                this.grow(worldIn, rand, pos, state);
            }
        }
    }
}
