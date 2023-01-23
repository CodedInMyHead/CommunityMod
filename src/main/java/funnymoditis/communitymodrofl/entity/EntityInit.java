package funnymoditis.communitymodrofl.entity;

import funnymoditis.communitymodrofl.Main;
import funnymoditis.communitymodrofl.entity.micha.EntityTheOne;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {

    public static void registerEntities() {
        registerEntity(ModEntity.THE_ONE.name, EntityTheOne.class, ModEntity.THE_ONE.id, 50, 2523691, 000000);
    }
    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int colorOne, int colorTwo ) {
        EntityRegistry.registerModEntity(new ResourceLocation(Main.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, colorOne, colorTwo);
    }
}
