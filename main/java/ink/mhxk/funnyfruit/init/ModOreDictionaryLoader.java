package ink.mhxk.funnyfruit.init;

import net.minecraft.init.Blocks;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDictionaryLoader {
	public ModOreDictionaryLoader() {
		OreDictionary.registerOre("logWood",ModBlockLoader.LOG_FUNNY_FRUIT);
	}

}
