// Date: 9/1/2019 2:00:05 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class M2A1reticle extends ModelBase {
    //fields
    ModelRenderer m2a1reticle1;
    ModelRenderer m2a1reticle2;

    public M2A1reticle() {
        textureWidth = 64;
        textureHeight = 32;

        m2a1reticle1 = new ModelRenderer(this, 0, 0);
        m2a1reticle1.addBox(0F, 0F, 0F, 1, 10, 0);
        m2a1reticle1.setRotationPoint(0F, -1F, 0F);
        m2a1reticle1.setTextureSize(64, 32);
        m2a1reticle1.mirror = true;
        setRotation(m2a1reticle1, 0F, 0F, 0F);
        m2a1reticle2 = new ModelRenderer(this, 0, 0);
        m2a1reticle2.addBox(0F, 0F, 0F, 10, 1, 0);
        m2a1reticle2.setRotationPoint(-4.5F, 3.5F, 0F);
        m2a1reticle2.setTextureSize(64, 32);
        m2a1reticle2.mirror = true;
        setRotation(m2a1reticle2, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        m2a1reticle1.render(f5);
        m2a1reticle2.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
