
package net.cheatmenu.module.modules;

import net.cheatmenu.module.Module;

public class Fly extends Module {
    public Fly() {
        super("Fly", "Movement");
    }

    @Override
    public void onEnable() {
        System.out.println("Fly enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("Fly disabled");
    }

    @Override
    public void onTick() {
    }
}
