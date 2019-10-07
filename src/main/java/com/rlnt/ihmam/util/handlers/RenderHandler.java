package com.rlnt.ihmam.util.handlers;

import com.rlnt.ihmam.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;

import javax.annotation.Nonnull;

class RenderHandler {
    static void registerCustomMeshesAndStates() {
        ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(ModBlocks.CRAFTING_ESSENCE_BLOCK), new ItemMeshDefinition()
        {
            @Nonnull
            @Override
            public ModelResourceLocation getModelLocation(@Nonnull ItemStack stack) {
                return new ModelResourceLocation("ihmam:crafting_essence", "fluid");
            }
        });

        ModelLoader.setCustomStateMapper(ModBlocks.CRAFTING_ESSENCE_BLOCK, new StateMapperBase() {
            @Nonnull
            @Override
            protected ModelResourceLocation getModelResourceLocation(@Nonnull IBlockState state) {
                return new ModelResourceLocation("ihmam:crafting_essence", "fluid");
            }
        });
    }
}
