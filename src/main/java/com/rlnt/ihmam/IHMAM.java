package com.rlnt.ihmam;

import com.rlnt.ihmam.proxy.IProxy;
import com.rlnt.ihmam.util.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = Reference.MOD_ID,
        name = Reference.MOD_NAME,
        version = Reference.MOD_VERSION,
        acceptedMinecraftVersions = Reference.MC_VERSION
)
public class IHMAM {

    // Instance
    @Mod.Instance
    public static IHMAM instance;

    // Proxy
    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
    public static IProxy proxy;

    // Config and Logger
    public static Logger logger;
    public static Configuration config;
}
