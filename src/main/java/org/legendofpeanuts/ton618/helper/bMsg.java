package org.legendofpeanuts.ton618.helper;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;
import java.util.logging.Level;

public class bMsg {

    public static void send(UUID uuid, String message){
        try {
            Bukkit.getServer().getPlayer(uuid).sendMessage(message);
        } catch (NullPointerException e) {
            Bukkit.getLogger().log(Level.WARNING, "Error occurred when attempting to send message to player: Player with specified UUID does not exist " + uuid.toString());
        }
    }

}
