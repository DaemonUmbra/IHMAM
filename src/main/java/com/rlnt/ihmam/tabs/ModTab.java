package com.rlnt.ihmam.tabs;

import com.rlnt.ihmam.init.ModItems;
import com.rlnt.ihmam.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;

public class ModTab extends CreativeTabs {

    public ModTab(String name) {
        super(Reference.MODID + "." + name);
    }

    @Nonnull
    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.RUINED_CRAFTING_COMPONENT_3);
    }
}
