package ink.mhxk.funnyfruit;

import ink.mhxk.funnyfruit.common.CommonProxy;
import ink.mhxk.funnyfruit.init.ModOreDictionaryLoader;
import ink.mhxk.funnyfruit.init.ModSmeltingLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;

@Mod(name=FunnyFruitMain.MODNAME,modid=FunnyFruitMain.MODID,version=FunnyFruitMain.MODVERSION)
public class FunnyFruitMain {
	@SidedProxy(serverSide="ink.mhxk.funnyfruit.common.CommonProxy",clientSide="ink.mhxk.funnyfruit.client.ClientProxy")
	public static CommonProxy proxy;
	public static final String MODNAME = "FunnyFruit";
	public static final String MODID = "funnyfruit";
	public static final String MODVERSION = "1.0";
	@Instance
	public static FunnyFruitMain INSTANCE;
	@EventHandler
	public void pre(FMLPreInitializationEvent event) {
		INSTANCE = this;
		MinecraftForge.EVENT_BUS.register(proxy);
		new ModOreDictionaryLoader();
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		new ModSmeltingLoader();
	}
	@EventHandler
	public void post(FMLPostInitializationEvent event) {
	}
}
