package ink.mhxk.funnyfruit.item;

import java.util.List;

import ink.mhxk.funnyfruit.init.ModCreativeTabLoader;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionUtils;
import net.minecraft.world.World;

public class ItemGoldenFunnyFruit 
extends ItemFood{

	public ItemGoldenFunnyFruit() {
		super(10, false);
		this.setAlwaysEdible();
		this.setCreativeTab(ModCreativeTabLoader.FUNNY_FRUIT);
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(1),20*60,1));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(16),20*60,1));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(13),20*60,1));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(3),20*60,2));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(5),20*60,2));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(10),20*30,2));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(11),20*300,2));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(12),20*300,1));
		super.onFoodEaten(stack, worldIn, player);
	}
	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
}
