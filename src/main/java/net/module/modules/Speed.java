package net.cheatmenu.module.modules;

import net.cheatmenu.module.Module;

public class Speed extends Module {
    public Speed() {
        super("Speed", "Movement");
    }

    @Override
    public void onEnable() {
        System.out.println("Speed enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("Speed disabled");
    }

    @Override
    public void onTick() {
    }
}
