package net.cheatmenu.module.modules;

import net.cheatmenu.module.Module;

public class HUD extends Module {
    public HUD() {
        super("HUD", "Render");
    }

    @Override
    public void onEnable() {
        System.out.println("HUD enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("HUD disabled");
    }

    @Override
    public void onTick() {
    }
}
