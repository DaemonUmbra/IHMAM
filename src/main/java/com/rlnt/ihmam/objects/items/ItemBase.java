package com.rlnt.ihmam.objects.items;

import com.rlnt.ihmam.IHMAM;
import com.rlnt.ihmam.init.ModItems;
import com.rlnt.ihmam.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String unlocalizedName, String registryName) {
        setTranslationKey(unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(IHMAM.IHMAM_TAB);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        IHMAM.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
