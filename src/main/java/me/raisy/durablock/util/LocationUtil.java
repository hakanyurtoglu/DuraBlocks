package me.raisy.durablock.util;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class LocationUtil {

    public static Location stringToLocation(String locationString) {
        String[] parts = locationString.split(",");
        String worldName = parts[0];
        int x = Integer.parseInt(parts[1]);
        int y = Integer.parseInt(parts[2]);
        int z = Integer.parseInt(parts[3]);

        World world = Bukkit.getWorld(worldName);

        return new Location(world, x, y, z);
    }

    public static String locationToString(Location location) {
        return location.getWorld().getName() + "," + location.getBlockX() + "," + location.getBlockY() + "," + location.getBlockZ();
    }

    public static Location centerLocation(Location location) {
        Location centerLoc = location.clone();
        centerLoc.setX((double) location.getBlockX() + (double) 0.5F);
        centerLoc.setY((double) location.getBlockY() + (double) 0.5F);
        centerLoc.setZ((double) location.getBlockZ() + (double) 0.5F);
        return centerLoc;
    }
}
