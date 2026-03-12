
package net.cheatmenu.module.modules;

import net.cheatmenu.module.Module;

public class FullBright extends Module {
    public FullBright() {
        super("FullBright", "Render");
    }

    @Override
    public void onEnable() {
        System.out.println("FullBright enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("FullBright disabled");
    }

    @Override
    public void onTick() {
    }
}
