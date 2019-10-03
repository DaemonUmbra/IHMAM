package com.rlnt.ihmam;

import com.rlnt.ihmam.proxy.CommonProxy;
import com.rlnt.ihmam.util.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = Reference.MODID,
        name = Reference.NAME,
        version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.MCVERSION
)
public class IHMAM {

    // Instance
    @Mod.Instance
    public static IHMAM instance;

    // Proxy
    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
    public static CommonProxy proxy;

    // Config and Logger
    public static Logger logger;
    public static Configuration config;

    // Pre Initialization
    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {

    }

    // Initialization
    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {

    }

    // Post Initialization
    @Mod.EventHandler
    public static  void PostInit(FMLPostInitializationEvent event) {

    }
}
