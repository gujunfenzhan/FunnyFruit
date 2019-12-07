package ink.mhxk.funnyfruit.common;

import ink.mhxk.funnyfruit.init.ModBlockLoader;
import ink.mhxk.funnyfruit.init.ModItemLoader;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonProxy {
	@SubscribeEvent
	public void registerItems(Register<Item> reg) {
	registerItemBlock(reg, ModBlockLoader.SAPLING_FUNNY_FRUIT);
	registerItemBlock(reg, ModBlockLoader.LOG_FUNNY_FRUIT);
	registerItemBlock(reg, ModBlockLoader.LEVEL_FUNNY_FRUIT);
	registerItemBlock(reg, ModBlockLoader.LEVEL_FUNNY);
	
	reg.getRegistry().register(ModItemLoader.FUNNY_FRUIT);
	reg.getRegistry().register(ModItemLoader.GOLDEN_FUNNY_FRUIT);
	}
	@SubscribeEvent
	public void registerBlocks(Register<Block> reg) {
		reg.getRegistry().register(ModBlockLoader.SAPLING_FUNNY_FRUIT);
		reg.getRegistry().register(ModBlockLoader.LOG_FUNNY_FRUIT);
		reg.getRegistry().register(ModBlockLoader.LEVEL_FUNNY_FRUIT);
		reg.getRegistry().register(ModBlockLoader.LEVEL_FUNNY);
	}
	public void registerItemBlock(Register<Item> reg,Block block) {
		reg.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
}
