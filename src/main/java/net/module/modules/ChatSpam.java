package net.cheatmenu.module.modules;

import net.cheatmenu.module.Module;

public class ChatSpam extends Module {
    public ChatSpam() {
        super("ChatSpam", "Misc");
    }

    @Override
    public void onEnable() {
        System.out.println("ChatSpam enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("ChatSpam disabled");
    }

    @Override
    public void onTick() {
    }
}
