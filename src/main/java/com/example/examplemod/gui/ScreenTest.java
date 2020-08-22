package com.example.examplemod.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.fml.client.gui.GuiUtils;
import org.lwjgl.opengl.GL11;

public class ScreenTest extends Screen {
    protected ScreenTest(ITextComponent titleIn) {
        super(titleIn);
    }

    @Override
    public void init(Minecraft p_init_1_, int p_init_2_, int p_init_3_) {
        super.init(p_init_1_, p_init_2_, p_init_3_);
    }

    @Override
    public void tick() {
        super.tick();
    }

    @Override
    public void renderBackground() {
        super.renderBackground();
    }

    @Override
    public void render(int p_render_1_, int p_render_2_, float p_render_3_) {
        float vertices[] = {1.0f,1.0f,1.0f,-1.0f,1.0f,1.0f,1.0f,-1.0f,1.0f,-1.0f,-1.0f,-1.0f,0.5f,0.5f,0.5f};
        GL11.glBegin(GL11.GL_POLYGON);
        GL11.glVertex3fv(vertices);
        GL11.glEnd();
        super.render(p_render_1_, p_render_2_, p_render_3_);
    }
}

