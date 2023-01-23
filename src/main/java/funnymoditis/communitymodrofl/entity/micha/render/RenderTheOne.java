package funnymoditis.communitymodrofl.entity.micha.render;

import funnymoditis.communitymodrofl.Main;
import funnymoditis.communitymodrofl.entity.micha.EntityTheOne;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderTheOne extends RenderLiving<EntityTheOne> {


    public static final ResourceLocation TEXTURES = new ResourceLocation(Main.MOD_ID + ":textures/entity/TheOne.png");

    public RenderTheOne(RenderManager manager) {
        super(manager, new ModelBase() {
            @Override
            public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
                super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            }
        }, 0.5F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityTheOne entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityTheOne entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
}
