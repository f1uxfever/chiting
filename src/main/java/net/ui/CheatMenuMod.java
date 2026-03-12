package net.cheatmenu.ui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.LiteralText;
import net.cheatmenu.CheatMenuMod;
import net.cheatmenu.module.Module;

public class ClickGUIScreen extends Screen {
    private String selectedCategory = "Combat";
    private int tabX = 10;
    private int tabY = 10;
    private int tabWidth = 100;
    private int tabHeight = 25;
    private float rainbowHue = 0;
    private static final int MODULE_WIDTH = 200;
    private static final int MODULE_HEIGHT = 25;
    private static final int MODULE_SPACING = 5;

    public ClickGUIScreen() {
        super(new LiteralText("Cheat Menu"));
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.rainbowHue += 0.005f;
        if (this.rainbowHue > 1) {
            this.rainbowHue = 0;
        }

        fill(matrices, 0, 0, this.width, this.height, 0xFF1a1a1a);

        renderTabs(matrices, mouseX, mouseY);
        renderModules(matrices, mouseX, mouseY);

        super.render(matrices, mouseX, mouseY, delta);
    }

    private void renderTabs(MatrixStack matrices, int mouseX, int mouseY) {
        int tabX = this.tabX;
        for (String category : CheatMenuMod.MODULES.getCategories()) {
            int color = isTabHovered(tabX, this.tabY, this.tabWidth, this.tabHeight, mouseX, mouseY) ? 0xFF4a4a4a : 0xFF2a2a2a;
            if (category.equals(this.selectedCategory)) {
                color = getRainbowColor(this.rainbowHue);
            }

            fill(matrices, tabX, this.tabY, tabX + this.tabWidth, this.tabY + this.tabHeight, color);
            this.textRenderer.draw(matrices, category, tabX + 10, this.tabY + 8, 0xFFFFFFFF);

            tabX += this.tabWidth + 5;
        }
    }

    private void renderModules(MatrixStack matrices, int mouseX, int mouseY) {
        int moduleY = this.tabY + this.tabHeight + 15;
        int moduleX = this.tabX;

        for (Module module : CheatMenuMod.MODULES.getModulesByCategory(this.selectedCategory)) {
            int backgroundColor = module.isEnabled() ? 0xFF004400 : 0xFF330000;
            fill(matrices, moduleX, moduleY, moduleX + MODULE_WIDTH, moduleY + MODULE_HEIGHT, backgroundColor);

            int textColor = module.isEnabled() ? 0xFF00FF00 : 0xFFFF0000;
            String statusText = module.getName() + " [" + (module.isEnabled() ? "ON" : "OFF") + "]";
            this.textRenderer.draw(matrices, statusText, moduleX + 10, moduleY + 8, textColor);

            moduleY += MODULE_HEIGHT + MODULE_SPACING;
        }
    }

    private boolean isTabHovered(int x, int y, int width, int height, int mouseX, int mouseY) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (button == 0) {
            int tabX = this.tabX;
            for (String category : CheatMenuMod.MODULES.getCategories()) {
                if (isTabHovered(tabX, this.tabY, this.tabWidth, this.tabHeight, (int) mouseX, (int) mouseY)) {
                    this.selectedCategory = category;
                    return true;
                }
                tabX += this.tabWidth + 5;
            }

            int moduleY = this.tabY + this.tabHeight + 15;
            int moduleX = this.tabX;
            for (Module module : CheatMenuMod.MODULES.getModulesByCategory(this.selectedCategory)) {
                if (mouseX >= moduleX && mouseX <= moduleX + MODULE_WIDTH &&
                    mouseY >= moduleY && mouseY <= moduleY + MODULE_HEIGHT) {
                    module.toggle();
                    return true;
                }
                moduleY += MODULE_HEIGHT + MODULE_SPACING;
            }
        }

        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public boolean shouldCloseOnEsc() {
        return true;
    }

    private int getRainbowColor(float hue) {
        float saturation = 1.0f;
        float brightness = 1.0f;

        int h = (int) (hue * 6);
        float f = hue * 6 - h;
        float p = brightness * (1 - saturation);
        float q = brightness * (1 - f * saturation);
        float t = brightness * (1 - (1 - f) * saturation);

        float r, g, b;
        switch (h % 6) {
            case 0:
                r = brightness;
                g = t;
                b = p;
                break;
            case 1:
                r = q;
                g = brightness;
                b = p;
                break;
            case 2:
                r = p;
                g = brightness;
                b = t;
                break;
            case 3:
                r = p;
                g = q;
                b = brightness;
                break;
            case 4:
                r = t;
                g = p;
                b = brightness;
                break;
            default:
                r = brightness;
                g = p;
                b = q;
        }

        int ir = Math.round(r * 255);
        int ig = Math.round(g * 255);
        int ib = Math.round(b * 255);

        return 0xFF000000 | (ir << 16) | (ig << 8) | ib;
    }
}
