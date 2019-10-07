package com.rlnt.ihmam;

import com.rlnt.ihmam.util.interfaces.IProxy;
import com.rlnt.ihmam.tabs.ModTab;
import com.rlnt.ihmam.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(
        modid = Reference.MODID,
        name = Reference.NAME,
        version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.MCVERSION
)
public class IHMAM {

    // Proxies
    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
    public static IProxy proxy;

    // Creative Tab
    public static final CreativeTabs IHMAM_TAB = new ModTab("tabIHMAM");
}
