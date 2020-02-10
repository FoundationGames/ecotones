package supercoder79.ecotones.surface;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class EcotonesSurfaces {
    public static SurfaceBuilder<TernarySurfaceConfig> DESERT_SCRUB_BUILDER;
    public static SurfaceBuilder<TernarySurfaceConfig> PEAT_SWAMP_BUILDER;

    public static void init() {
        DESERT_SCRUB_BUILDER = Registry.register(Registry.SURFACE_BUILDER, new Identifier("ecotones", "desert_scrub_builder"), new DesertScrubSurfaceBuilder(TernarySurfaceConfig::deserialize));
        PEAT_SWAMP_BUILDER = Registry.register(Registry.SURFACE_BUILDER, new Identifier("ecotones", "peat_swamp_builder"), new PeatSwampSurfaceBuilder(TernarySurfaceConfig::deserialize));
    }
}