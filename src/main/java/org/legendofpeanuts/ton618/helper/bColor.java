package org.legendofpeanuts.ton618.helper;

import org.bukkit.ChatColor;

public class bColor {

    public static String parse(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

}
