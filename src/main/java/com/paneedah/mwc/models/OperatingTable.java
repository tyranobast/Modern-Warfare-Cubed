// Date: 2/17/2019 11:02:12 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class OperatingTable extends ModelBase {
    //fields
    ModelRenderer table1;
    ModelRenderer table2;
    ModelRenderer table3;
    ModelRenderer table4;
    ModelRenderer table5;
    ModelRenderer table6;
    ModelRenderer table7;
    ModelRenderer table8;
    ModelRenderer table9;
    ModelRenderer table10;
    ModelRenderer table11;
    ModelRenderer table12;
    ModelRenderer table13;

    public OperatingTable() {
        textureWidth = 256;
        textureHeight = 256;

        table1 = new ModelRenderer(this, 0, 0);
        table1.addBox(0F, 0F, 0F, 8, 6, 8);
        table1.setRotationPoint(-4F, 14F, -4F);
        table1.setTextureSize(256, 256);
        table1.mirror = true;
        setRotation(table1, 0F, 0F, 0F);
        table2 = new ModelRenderer(this, 0, 30);
        table2.addBox(0F, 0F, 0F, 10, 2, 15);
        table2.setRotationPoint(-5F, 20F, -6F);
        table2.setTextureSize(256, 256);
        table2.mirror = true;
        setRotation(table2, 0F, 0F, 0F);
        table3 = new ModelRenderer(this, 0, 30);
        table3.addBox(0F, 0F, 0F, 3, 2, 6);
        table3.setRotationPoint(-6F, 20F, -11F);
        table3.setTextureSize(256, 256);
        table3.mirror = true;
        setRotation(table3, 0F, 0.1858931F, 0F);
        table4 = new ModelRenderer(this, 0, 30);
        table4.addBox(-3F, 0F, 0F, 3, 2, 6);
        table4.setRotationPoint(6F, 20F, -11F);
        table4.setTextureSize(256, 256);
        table4.mirror = true;
        setRotation(table4, 0F, -0.185895F, 0F);
        table5 = new ModelRenderer(this, 0, 30);
        table5.addBox(0F, 0F, 0F, 2, 2, 2);
        table5.setRotationPoint(3.5F, 23F, -11.5F);
        table5.setTextureSize(256, 256);
        table5.mirror = true;
        setRotation(table5, 0.7853982F, 0F, 0F);
        table6 = new ModelRenderer(this, 0, 30);
        table6.addBox(0F, 0F, 0F, 2, 2, 2);
        table6.setRotationPoint(-5.5F, 23F, -11.5F);
        table6.setTextureSize(256, 256);
        table6.mirror = true;
        setRotation(table6, 0.7853982F, 0F, 0F);
        table7 = new ModelRenderer(this, 0, 30);
        table7.addBox(0F, 0F, 0F, 2, 2, 2);
        table7.setRotationPoint(2.5F, 23F, 6.5F);
        table7.setTextureSize(256, 256);
        table7.mirror = true;
        setRotation(table7, 0.7853982F, 0F, 0F);
        table8 = new ModelRenderer(this, 0, 30);
        table8.addBox(0F, 0F, 0F, 2, 2, 2);
        table8.setRotationPoint(-4.5F, 23F, 6.5F);
        table8.setTextureSize(256, 256);
        table8.mirror = true;
        setRotation(table8, 0.7853982F, 0F, 0F);
        table9 = new ModelRenderer(this, 0, 60);
        table9.addBox(0F, 0F, 0F, 7, 4, 7);
        table9.setRotationPoint(-3.5F, 10F, -3.5F);
        table9.setTextureSize(256, 256);
        table9.mirror = true;
        setRotation(table9, 0F, 0F, 0F);
        table10 = new ModelRenderer(this, 0, 0);
        table10.addBox(0F, 0F, 0F, 11, 2, 23);
        table10.setRotationPoint(-5.5F, 8F, -17.5F);
        table10.setTextureSize(256, 256);
        table10.mirror = true;
        setRotation(table10, 0F, 0F, 0F);
        table11 = new ModelRenderer(this, 0, 0);
        table11.addBox(0F, 0F, 0F, 11, 13, 2);
        table11.setRotationPoint(-5.5F, 10F, 5.5F);
        table11.setTextureSize(256, 256);
        table11.mirror = true;
        setRotation(table11, 1.821752F, 0F, 0F);
        table12 = new ModelRenderer(this, 0, 90);
        table12.addBox(0F, 0F, 0F, 12, 2, 24);
        table12.setRotationPoint(-6F, 6F, -18F);
        table12.setTextureSize(256, 256);
        table12.mirror = true;
        setRotation(table12, 0F, 0F, 0F);
        table13 = new ModelRenderer(this, 0, 90);
        table13.addBox(0F, 0F, 0F, 12, 12, 2);
        table13.setRotationPoint(-6F, 8F, 6F);
        table13.setTextureSize(256, 256);
        table13.mirror = true;
        setRotation(table13, 1.821752F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        table1.render(f5);
        table2.render(f5);
        table3.render(f5);
        table4.render(f5);
        table5.render(f5);
        table6.render(f5);
        table7.render(f5);
        table8.render(f5);
        table9.render(f5);
        table10.render(f5);
        table11.render(f5);
        table12.render(f5);
        table13.render(f5);
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
