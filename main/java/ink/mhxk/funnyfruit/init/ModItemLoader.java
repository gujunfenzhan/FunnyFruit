package ink.mhxk.funnyfruit.init;

import ink.mhxk.funnyfruit.item.ItemFunnyFruit;
import ink.mhxk.funnyfruit.item.ItemGoldenFunnyFruit;
import net.minecraft.item.Item;

public interface ModItemLoader {
	Item FUNNY_FRUIT = new ItemFunnyFruit().setRegistryName("funny_fruit").setUnlocalizedName("funnyFruit");
	Item GOLDEN_FUNNY_FRUIT = new ItemGoldenFunnyFruit().setRegistryName("golden_funny_fruit").setUnlocalizedName("goldenFunnyFruit");
}
