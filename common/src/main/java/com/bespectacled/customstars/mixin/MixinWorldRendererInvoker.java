package com.bespectacled.customstars.mixin;

import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(WorldRenderer.class)
public interface MixinWorldRendererInvoker {
    @Invoker("renderStars")
    void rerenderStars(BufferBuilder builder);
}
