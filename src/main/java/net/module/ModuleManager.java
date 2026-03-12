package net.cheatmenu.module;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.cheatmenu.module.modules.*;

import java.util.*;

public class ModuleManager {
    private List<Module> modules = new ArrayList<>();
    private Map<String, List<Module>> modulesByCategory = new LinkedHashMap<>();

    public ModuleManager() {
        modulesByCategory.put("Combat", new ArrayList<>());
        modulesByCategory.put("Movement", new ArrayList<>());
        modulesByCategory.put("Render", new ArrayList<>());
        modulesByCategory.put("Misc", new ArrayList<>());
    }

    public void loadModules() {
        // Combat
        addModule(new KillAura());
        addModule(new TriggerBot());
        addModule(new AutoClicker());

        // Movement
        addModule(new AutoSprint());
        addModule(new NoFall());
        addModule(new Speed());
        addModule(new Fly());

        // Render
        addModule(new FullBright());
        addModule(new ESP());
        addModule(new Tracers());
        addModule(new HUD());
        addModule(new Coordinates());

        // Misc
        addModule(new AutoFish());
        addModule(new ChatSpam());
        addModule(new Timer());

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            for (Module module : modules) {
                if (module.isEnabled()) {
                    module.onTick();
                }
            }
        });
    }

    public void addModule(Module module) {
        modules.add(module);
        modulesByCategory.get(module.getCategory()).add(module);
    }

    public List<Module> getModules() {
        return modules;
    }

    public List<Module> getModulesByCategory(String category) {
        return modulesByCategory.getOrDefault(category, new ArrayList<>());
    }

    public Set<String> getCategories() {
        return modulesByCategory.keySet();
    }

    public Module getModule(String name) {
        return modules.stream()
            .filter(m -> m.getName().equals(name))
            .findFirst()
            .orElse(null);
    }
}
