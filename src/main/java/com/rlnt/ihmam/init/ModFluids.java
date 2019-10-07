package com.rlnt.ihmam.init;

import com.rlnt.ihmam.objects.fluids.FluidLiquid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {

    /*  Fluids  */
    // Crafting Essence
    static final Fluid CRAFTING_ESSENCE = new FluidLiquid("fluidCraftingEssence", "crafting_essence",
            new ResourceLocation("ihmam:blocks/crafting_essence_still"),
            new ResourceLocation("ihmam:blocks/crafting_essence_flow"));


    /*  Fluid Registry  */
    public static void registerFluids() {
        registerFluid(CRAFTING_ESSENCE);
    }

    private static void registerFluid(Fluid fluid) {
        FluidRegistry.registerFluid(fluid);
        FluidRegistry.addBucketForFluid(fluid);
    }
}
