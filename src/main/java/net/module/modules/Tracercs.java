package net.cheatmenu.module.modules;

import net.cheatmenu.module.Module;

public class Tracers extends Module {
    public Tracers() {
        super("Tracers", "Render");
    }

    @Override
    public void onEnable() {
        System.out.println("Tracers enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("Tracers disabled");
    }

    @Override
    public void onTick() {
    }
}
