package me.qrystalgg.toxigon;

import me.qrystalgg.toxigon.commands.Coords;
import me.qrystalgg.toxigon.modules.*;

import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class Toxigon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("Extras");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Toxigon");

        // Modules
        Modules.get().add(new InfAura());
        Modules.get().add(new LoginCommand());
        Modules.get().add(new FlightPlus());
        Modules.get().add(new ReachPlus());
        Modules.get().add(new WGBypass());
        Modules.get().add(new AutoDrink());
        Modules.get().add(new AutoOminous());
        Modules.get().add(new Prefix());
        Modules.get().add(new XPAura());
        Modules.get().add(new TooManyPackets());
        Modules.get().add(new AutoFarmPlus());
        Modules.get().add(new AutoPause());
        Modules.get().add(new DeathSpots());

        // Commands
        Commands.add(new Coords());
        // HUD
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "me.qrystalgg.toxigon";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("qrystalgg", "Toxigon");
    }
}
