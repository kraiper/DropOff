package main.java.dropoff.logic;

import main.java.dropoff.objects.Direction;
import main.java.dropoff.objects.Player;

public class Move
{
    public static void move(Player player, Direction rotation, int direction)
    {
        player.setPossition(player.getX()+(rotation.getX()/direction), player.getY()+(rotation.getY()/direction));
    }
}
