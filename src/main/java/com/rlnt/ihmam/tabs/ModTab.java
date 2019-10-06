package com.rlnt.ihmam.tabs;

import com.rlnt.ihmam.init.ModItems;
import com.rlnt.ihmam.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModTab extends CreativeTabs {

    public ModTab(String name) {
        super(Reference.MODID + "." + name);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.CRAFTING_COMPONENT);
    }
}
