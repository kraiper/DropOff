package main.java.dropoff.logic;

import main.java.dropoff.objects.Player;
import main.java.dropoff.objects.Direction;

public class CommandHandler
{
    public static void handleCommand(int command, Player player, Direction direction)
    {
        // Handle the command
        switch(command)
        {
            case 1: // move forward one step
                Move.move(player, direction, 1);
                break;
            case 2: // move backwards one step
                Move.move(player, direction, -1);
                break;
            case 3: // rotate clockwise 90 degrees (eg north to east)
                Rotate.rotate(direction,-Math.PI/2);
                break;
            case 4: // rotate counterclockwise 90 degrees (eg west to south)
                Rotate.rotate(direction,Math.PI/2);
                break;
        }
    }
}
