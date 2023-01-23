package funnymoditis.communitymodrofl.util.handlers;

import funnymoditis.communitymodrofl.entity.micha.EntityTheOne;
import funnymoditis.communitymodrofl.entity.micha.render.RenderTheOne;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityHandlers() {
        RenderingRegistry.registerEntityRenderingHandler(EntityTheOne.class, new IRenderFactory<EntityTheOne>() {
            @Override
            public Render<? super EntityTheOne> createRenderFor(RenderManager manager) {
                return new RenderTheOne(manager);
            }
        });
    }
}
