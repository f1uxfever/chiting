package net.cheatmenu.module.modules;

import net.cheatmenu.module.Module;

public class AutoClicker extends Module {
    public AutoClicker() {
        super("AutoClicker", "Combat");
    }

    @Override
    public void onEnable() {
        System.out.println("AutoClicker enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("AutoClicker disabled");
    }

    @Override
    public void onTick() {
    }
}
