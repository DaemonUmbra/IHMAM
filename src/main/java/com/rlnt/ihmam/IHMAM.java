package com.rlnt.ihmam;

import com.rlnt.ihmam.util.handlers.RegistryHandler;
import com.rlnt.ihmam.util.interfaces.IProxy;
import com.rlnt.ihmam.tabs.ModTab;
import com.rlnt.ihmam.util.Reference;
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
        modid = Reference.MODID,
        name = Reference.NAME,
        version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.MCVERSION
)
@Mod.EventBusSubscriber()
public class IHMAM {
    @Mod.Instance(Reference.MODID)
    public static IHMAM INSTANCE;

    public static final Logger LOGGER = LogManager.getLogger(Reference.NAME);

    public static Configuration CONFIG;

    // Proxies
    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
    public static IProxy proxy;

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

    @Config(modid = Reference.MODID)
    public static class cfg {

    }
}
