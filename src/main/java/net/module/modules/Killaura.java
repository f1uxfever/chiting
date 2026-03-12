package net.cheatmenu.module.modules;

import net.cheatmenu.module.Module;

public class KillAura extends Module {
    public KillAura() {
        super("KillAura", "Combat");
    }

    @Override
    public void onEnable() {
        System.out.println("KillAura enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("KillAura disabled");
    }

    @Override
    public void onTick() {
    }
}
