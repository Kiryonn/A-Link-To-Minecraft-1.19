package net.kiryonn.alinktominecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class ALinkToMinecraftClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HudRenderCallback.EVENT.register(((matrixStack, tickDelta) -> {
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.setShader(GameRenderer::getPositionTexShader);
            RenderSystem.setShaderTexture(0, new Identifier("minecraft", "emerald"));

            DrawableHelper.drawTexture(matrixStack, 0,
                    0, 0, 0, 16,
                    16, 16,
                    16);

            TextRenderer textRenderer = MinecraftClient.getInstance().textRenderer;
            MatrixStack textRendererMatrixStack = new MatrixStack();
            textRendererMatrixStack.scale(1.0F, 1.0F, 1.0F);
            textRenderer.draw(textRendererMatrixStack, "x000", 16, 4, 1);

        }));
    }
}
