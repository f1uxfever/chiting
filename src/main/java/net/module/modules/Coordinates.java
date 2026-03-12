package net.cheatmenu.module.modules;

import net.cheatmenu.module.Module;

public class Coordinates extends Module {
    public Coordinates() {
        super("Coordinates", "Render");
    }

    @Override
    public void onEnable() {
        System.out.println("Coordinates enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("Coordinates disabled");
    }

    @Override
    public void onTick() {
    }
}
