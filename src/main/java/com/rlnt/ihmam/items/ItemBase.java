package com.rlnt.ihmam.items;

import com.rlnt.ihmam.IHMAM;
import com.rlnt.ihmam.init.ModItems;
import com.rlnt.ihmam.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        IHMAM.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
