package net.cheatmenu.module.modules;

import net.cheatmenu.module.Module;

public class AutoFish extends Module {
    public AutoFish() {
        super("AutoFish", "Misc");
    }

    @Override
    public void onEnable() {
        System.out.println("AutoFish enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("AutoFish disabled");
    }

    @Override
    public void onTick() {
    }
}
