package net.cheatmenu.module.modules;

import net.cheatmenu.module.Module;

public class AutoSprint extends Module {
    public AutoSprint() {
        super("AutoSprint", "Movement");
    }

    @Override
    public void onEnable() {
        System.out.println("AutoSprint enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("AutoSprint disabled");
    }

    @Override
    public void onTick() {
    }
}
