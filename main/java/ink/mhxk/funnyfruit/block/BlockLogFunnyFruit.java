package ink.mhxk.funnyfruit.block;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;
import com.google.common.base.Predicate;
import ink.mhxk.funnyfruit.init.ModCreativeTabLoader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
public class BlockLogFunnyFruit extends BlockLog {
	public BlockLogFunnyFruit() {
		this.setDefaultState(this.blockState.getBaseState().withProperty(LOG_AXIS, EnumAxis.Y));
		this.setCreativeTab(ModCreativeTabLoader.FUNNY_FRUIT);
		this.setHardness(1.5F);
		this.setHarvestLevel("axe", 1);
		
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, LOG_AXIS);
	}

	public IBlockState getStateFromMeta(int meta) {
		EnumAxis enumfacing$axis = EnumAxis.Y;
		int i = meta & 12;

		if (i == 4) {
			enumfacing$axis = EnumAxis.X;
		} else if (i == 8) {
			enumfacing$axis = EnumAxis.Z;
		}

		return this.getDefaultState().withProperty(LOG_AXIS, enumfacing$axis);
	}

	/**
	 * Convert the BlockState into the correct metadata value
	 */
	public int getMetaFromState(IBlockState state) {
		int i = 0;
		EnumAxis enumfacing$axis = (EnumAxis) state.getValue(LOG_AXIS);

		if (enumfacing$axis == EnumAxis.X) {
			i |= 4;
		} else if (enumfacing$axis == EnumAxis.Z) {
			i |= 8;
		}

		return i;
	}
}
