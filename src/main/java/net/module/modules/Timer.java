package net.cheatmenu.module.modules;

import net.cheatmenu.module.Module;

public class Timer extends Module {
    public Timer() {
        super("Timer", "Misc");
    }

    @Override
    public void onEnable() {
        System.out.println("Timer enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("Timer disabled");
    }

    @Override
    public void onTick() {
    }
}
