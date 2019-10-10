package com.rlnt.ihmam.common.item;

import com.rlnt.ihmam.IHMAM;
import com.rlnt.ihmam.common.item.ModItems;
import com.rlnt.ihmam.util.interfaces.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String unlocalizedName, String registryName) {
        setUnlocalizedName(unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(IHMAM.IHMAM_TAB);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        IHMAM.proxy.registerModel(this, 0);
    }
}
