package main.java.dropoff.validation;

import main.java.dropoff.objects.Player;
import main.java.dropoff.objects.Table;

public class ValidatePosition
{
    public static boolean validatePosition(Player player, Table table)
    {
        // Validate player not outside table bounds
        if(player.getX() < 0 || player.getY() < 0 ||
           player.getX() >= table.getTableSizeX() || player.getY() >= table.getTableSizeY())
        {
            return false;
        }

        // This wont do anything for this senario but if the table get holes you could fall
        if (table.getMatrix()[player.getX()][player.getY()] != 1)
        {
            return false;
        }
        return true;
    }
}
