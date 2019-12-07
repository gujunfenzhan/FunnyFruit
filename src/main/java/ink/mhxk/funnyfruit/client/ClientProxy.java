package ink.mhxk.funnyfruit.client;

import ink.mhxk.funnyfruit.common.CommonProxy;
import ink.mhxk.funnyfruit.init.ModBlockLoader;
import ink.mhxk.funnyfruit.init.ModItemLoader;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy 
extends CommonProxy{
	@SubscribeEvent
	public void registerModels(ModelRegistryEvent reg) {
		registerBlockModel(ModBlockLoader.SAPLING_FUNNY_FRUIT);
		registerBlockModel(ModBlockLoader.LOG_FUNNY_FRUIT);
		registerBlockModel(ModBlockLoader.LEVEL_FUNNY_FRUIT);
		registerBlockModel(ModBlockLoader.LEVEL_FUNNY);
	
		registerItemModel(ModItemLoader.FUNNY_FRUIT);
		registerItemModel(ModItemLoader.GOLDEN_FUNNY_FRUIT);
	}
	public void registerItemModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}
	public void registerBlockModel(Block block) {
		registerItemModel(Item.getItemFromBlock(block));
	}

}
