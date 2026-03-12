package net.cheatmenu.module.modules;

import net.cheatmenu.module.Module;

public class ESP extends Module {
    public ESP() {
        super("ESP", "Render");
    }

    @Override
    public void onEnable() {
        System.out.println("ESP enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("ESP disabled");
    }

    @Override
    public void onTick() {
    }
}
