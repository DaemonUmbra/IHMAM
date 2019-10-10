package com.rlnt.ihmam;

import com.rlnt.ihmam.common.CommonProxy;
import com.rlnt.ihmam.util.handlers.RegistryHandler;
import com.rlnt.ihmam.tabs.ModTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = IHMAM.MOD_ID,
        name = IHMAM.MOD_NAME,
        version = IHMAM.VERSION,
        acceptedMinecraftVersions = IHMAM.MC_VERSION
)
@Mod.EventBusSubscriber()
public class IHMAM {
    public static final String MOD_ID = "ihmam";
    public static final String MOD_NAME = "I helped making a mistake";
    public static final String VERSION = "%VERSION%";
    public static final String MC_VERSION = "[1.12.2]";

    public static final String CLIENT = "com.rlnt.ihmam.client.ClientProxy";
    public static final String SERVER = "com.rlnt.ihmam.common.CommonProxy";

    @Mod.Instance(MOD_ID)
    public static IHMAM INSTANCE;

    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    public static Configuration CONFIG;

    // Proxies
    @SidedProxy(clientSide = CLIENT, serverSide = SERVER)
    public static CommonProxy proxy;

    // Creative Tab
    public static final CreativeTabs IHMAM_TAB = new ModTab("tabIHMAM");

    // Fluid Registry
    static {
        FluidRegistry.enableUniversalBucket();
    }

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        RegistryHandler.preInitRegistries(event);
    }

    @Config(modid = MOD_ID)
    public static class cfg {

    }
}
