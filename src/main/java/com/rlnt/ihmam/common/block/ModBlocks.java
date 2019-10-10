package com.rlnt.ihmam.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    // Block List
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    /*  Blocks  */
    // Fluids
    public static final Block CRAFTING_ESSENCE_BLOCK = new BlockFluid("blockCraftingEssence", "crafting_essence", ModFluids.CRAFTING_ESSENCE, Material.LAVA);
}
