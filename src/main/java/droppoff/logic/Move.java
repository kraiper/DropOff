package main.java.droppoff.logic;

import main.java.droppoff.objects.Direction;
import main.java.droppoff.objects.Player;

public class Move
{
    public static void move(Player player, Direction rotation, int direction)
    {
        player.setPossition(player.getX()+(rotation.getX()/direction), player.getY()+(rotation.getY()/direction));
    }
}
