package ink.mhxk.funnyfruit.creativetab;

import ink.mhxk.funnyfruit.init.ModBlockLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabFunnyFruit 
extends CreativeTabs{

	public CreativeTabFunnyFruit() {
		super("creativeTab.funnyFruit");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlockLoader.SAPLING_FUNNY_FRUIT);
	}

}
