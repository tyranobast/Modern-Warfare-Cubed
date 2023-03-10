// Date: 5/7/2016 1:36:31 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Bullet extends ModelBase
{
  //fields
    ModelRenderer bullet;
  
  public Bullet()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      bullet = new ModelRenderer(this, 0, 0);
      bullet.addBox(0F, 0F, 0F, 1, 1, 1);
      bullet.setRotationPoint(0F, 0F, 0F);
      bullet.setTextureSize(64, 32);
      bullet.mirror = true;
      setRotation(bullet, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    bullet.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}