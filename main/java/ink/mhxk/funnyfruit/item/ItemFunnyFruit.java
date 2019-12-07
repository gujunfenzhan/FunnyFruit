package ink.mhxk.funnyfruit.item;

import ink.mhxk.funnyfruit.init.ModBlockLoader;
import ink.mhxk.funnyfruit.init.ModCreativeTabLoader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFunnyFruit 
extends ItemFood{

	public ItemFunnyFruit() {
		super(6, false);
		this.setCreativeTab(ModCreativeTabLoader.FUNNY_FRUIT);
	}
}
