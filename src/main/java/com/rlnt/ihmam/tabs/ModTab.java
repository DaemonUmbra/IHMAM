package com.rlnt.ihmam.tabs;

import com.rlnt.ihmam.IHMAM;
import com.rlnt.ihmam.common.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;

public class ModTab extends CreativeTabs {

    // Set Tab Name
    public ModTab(String name) {
        super(IHMAM.MOD_ID + "." + name);
    }

    // Fill Tab
    private NonNullList<ItemStack> list;

    @Override
    public void displayAllRelevantItems(@Nonnull NonNullList<ItemStack> list) {
        this.list = list;

        // Items
        addItem(ModItems.BASIC_CRAFTING_COMPONENT_1);
        addItem(ModItems.BASIC_CRAFTING_COMPONENT_2);
        addItem(ModItems.BASIC_CRAFTING_COMPONENT_3);
        addItem(ModItems.BAD_CRAFTING_COMPONENT_1);
        addItem(ModItems.BAD_CRAFTING_COMPONENT_2);
        addItem(ModItems.BAD_CRAFTING_COMPONENT_3);
        addItem(ModItems.WORSE_CRAFTING_COMPONENT_1);
        addItem(ModItems.WORSE_CRAFTING_COMPONENT_2);
        addItem(ModItems.WORSE_CRAFTING_COMPONENT_3);
        addItem(ModItems.MISERABLE_CRAFTING_COMPONENT_1);
        addItem(ModItems.MISERABLE_CRAFTING_COMPONENT_2);
        addItem(ModItems.MISERABLE_CRAFTING_COMPONENT_3);
        addItem(ModItems.RUINED_CRAFTING_COMPONENT_1);
        addItem(ModItems.RUINED_CRAFTING_COMPONENT_2);
        addItem(ModItems.RUINED_CRAFTING_COMPONENT_3);

        addItem(ModItems.FLUID_COMPONENT_1);
        addItem(ModItems.FLUID_COMPONENT_2);
        addItem(ModItems.FLUID_COMPONENT_3);

        // Fluids
        // addBlock(ModBlocks.CRAFTING_ESSENCE_BLOCK);
        // addItem(UniversalBucket.getItemFromBlock(ModBlocks.CRAFTING_ESSENCE_BLOCK));
    }

    private void addItem(Item item) {
        item.getSubItems(this, list);
    }

    private void addBlock(Block block) {
        ItemStack stack = new ItemStack(block);
        block.getSubBlocks(this, list);
    }

    @Nonnull
    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.RUINED_CRAFTING_COMPONENT_3);
    }

}
