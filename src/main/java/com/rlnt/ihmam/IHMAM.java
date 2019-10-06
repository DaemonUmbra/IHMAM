package com.rlnt.ihmam;

import com.rlnt.ihmam.util.handlers.RegistryHandler;
import com.rlnt.ihmam.util.interfaces.IProxy;
import com.rlnt.ihmam.tabs.ModTab;
import com.rlnt.ihmam.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = Reference.MODID,
        name = Reference.NAME,
        version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.MCVERSION
)
public class IHMAM {

    // Instance
    @Instance
    public static IHMAM instance;

    // Proxies
    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
    public static IProxy proxy;

    // Logger
    public static Logger logger;

    // Creative Tab
    public static final CreativeTabs IHMAM_TAB = new ModTab("tabIHMAM");

    // Pre Init
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        RegistryHandler.preInitRegistry(event);
    }

    // Init
    @EventHandler
    public static void init(FMLInitializationEvent event) {
        RegistryHandler.initRegistry(event);
    }

    // Post Init
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        RegistryHandler.postInitRegistry(event);
    }

    // Server Init
    @EventHandler
    public static void serverInit(FMLServerStartedEvent event) {
        RegistryHandler.serverInitRegistry(event);
    }
}
