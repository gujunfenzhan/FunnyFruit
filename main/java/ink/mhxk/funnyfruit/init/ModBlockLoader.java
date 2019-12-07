package ink.mhxk.funnyfruit.init;
import ink.mhxk.funnyfruit.block.BlockLevelFunny;
import ink.mhxk.funnyfruit.block.BlockLevelFunnyFruit;
import ink.mhxk.funnyfruit.block.BlockLogFunnyFruit;
import ink.mhxk.funnyfruit.block.BlockSaplingFunnyFruit;
import net.minecraft.block.Block;

public interface ModBlockLoader{
	Block SAPLING_FUNNY_FRUIT = new BlockSaplingFunnyFruit().setRegistryName("sapling_funny_fruit").setUnlocalizedName("SaplingFunnyFruit");
	Block LOG_FUNNY_FRUIT = new BlockLogFunnyFruit().setRegistryName("log_funny_fruit").setUnlocalizedName("logFunnyFruit");
	Block LEVEL_FUNNY_FRUIT = new BlockLevelFunnyFruit().setRegistryName("level_funny_fruit").setUnlocalizedName("levelFunnyFruit");
	Block LEVEL_FUNNY = new BlockLevelFunny().setRegistryName("level_funny").setUnlocalizedName("levelFunny");
}
