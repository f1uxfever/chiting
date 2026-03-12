package net.cheatmenu.module.modules;

import net.cheatmenu.module.Module;

public class NoFall extends Module {
    public NoFall() {
        super("NoFall", "Movement");
    }

    @Override
    public void onEnable() {
        System.out.println("NoFall enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("NoFall disabled");
    }

    @Override
    public void onTick() {
    }
}
