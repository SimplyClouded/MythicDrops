package net.nunnerycode.bukkit.mythicdrops.api;

import net.nunnerycode.bukkit.libraries.ivory.config.IvoryYamlConfiguration;
import net.nunnerycode.bukkit.libraries.ivory.config.VersionedIvoryYamlConfiguration;
import net.nunnerycode.bukkit.mythicdrops.api.settings.*;
import se.ranzdo.bukkit.methodcommand.CommandHandler;

import java.util.List;
import java.util.Random;
import java.util.logging.Level;

public interface MythicDrops {

    VersionedIvoryYamlConfiguration getCreatureSpawningYAML();

    void debug(Level level, String... messages);

    ConfigSettings getConfigSettings();

    CreatureSpawningSettings getCreatureSpawningSettings();

    RepairingSettings getRepairingSettings();

    SockettingSettings getSockettingSettings();

    IdentifyingSettings getIdentifyingSettings();

    VersionedIvoryYamlConfiguration getConfigYAML();

    VersionedIvoryYamlConfiguration getCustomItemYAML();

    VersionedIvoryYamlConfiguration getItemGroupYAML();

    VersionedIvoryYamlConfiguration getLanguageYAML();

    VersionedIvoryYamlConfiguration getTierYAML();

    VersionedIvoryYamlConfiguration getSocketGemsYAML();

    VersionedIvoryYamlConfiguration getSockettingYAML();

    VersionedIvoryYamlConfiguration getRepairingYAML();

    VersionedIvoryYamlConfiguration getIdentifyingYAML();

    void reloadSettings();

    void reloadTiers();

    void reloadCustomItems();

    void reloadNames();

    CommandHandler getCommandHandler();

    void reloadDistanceZones();

    Random getRandom();

    List<IvoryYamlConfiguration> getTierYAMLs();

    VersionedIvoryYamlConfiguration getDistanceZonesYAML();

    PopulatingSettings getPopulatingSettings();
}
