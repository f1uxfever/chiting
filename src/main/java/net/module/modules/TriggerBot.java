package net.cheatmenu.module.modules;

import net.cheatmenu.module.Module;

public class TriggerBot extends Module {
    public TriggerBot() {
        super("TriggerBot", "Combat");
    }

    @Override
    public void onEnable() {
        System.out.println("TriggerBot enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("TriggerBot disabled");
    }

    @Override
    public void onTick() {
    }
}
