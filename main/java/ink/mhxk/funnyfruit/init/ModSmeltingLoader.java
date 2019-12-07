package ink.mhxk.funnyfruit.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmeltingLoader {
	public ModSmeltingLoader() {
		GameRegistry.addSmelting(ModBlockLoader.LOG_FUNNY_FRUIT,new ItemStack(ModItemLoader.FUNNY_FRUIT),0.5F);
	}

}
