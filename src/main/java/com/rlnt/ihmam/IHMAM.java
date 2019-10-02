package com.rlnt.ihmam;

import com.rlnt.ihmam.proxy.IProxy;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = IHMAM.MOD_ID,
        name = IHMAM.MOD_NAME,
        version = IHMAM.MOD_VERSION,
        acceptedMinecraftVersions = IHMAM.MC_VERSION
)
public class IHMAM {
    public static final String MOD_ID = "ihmam";
    public static final String MOD_NAME = "I helped making a mistake";
    public static final String MOD_VERSION = "@VERSION@";
    public static final String MC_VERSION = "[@MCVERSION@]";

    // Proxies
    public static final String CLIENT = "com.rlnt.ihmam.proxy.client.ClientProxy";
    public static final String SERVER = "com.rlnt.ihmam.proxy.common.CommonProxy";

    @SidedProxy(clientSide = IHMAM.CLIENT, serverSide = IHMAM.SERVER)
    public static IProxy proxy;

    @Mod.Instance(MOD_ID)
    public static IHMAM instance;

    // Config and Logger
    public static Logger logger;
    public static Configuration config;

}
