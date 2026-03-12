package net.cheatmenu;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.options.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import net.cheatmenu.module.ModuleManager;
import net.cheatmenu.ui.ClickGUIScreen;
import net.minecraft.client.MinecraftClient;

public class CheatMenuMod implements ClientModInitializer {
    public static final String MOD_ID = "cheatmenu";
    public static MinecraftClient MC;
    public static ModuleManager MODULES;
    private static KeyBinding menuKey;

    @Override
    public void onInitializeClient() {
        MC = MinecraftClient.getInstance();
        MODULES = new ModuleManager();
        MODULES.loadModules();

        menuKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.cheatmenu.menu",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_RIGHT_SHIFT,
            "category.cheatmenu"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (menuKey.wasPressed()) {
                MinecraftClient.getInstance().openScreen(new ClickGUIScreen());
            }
        });

        System.out.println("Cheat Menu initialized!");
    }
}
