package main.java.droppoff.logic;

import main.java.droppoff.objects.Player;
import main.java.droppoff.objects.Direction;
import main.java.droppoff.objects.Table;
import main.java.droppoff.validation.ValidatePosition;

import java.util.ArrayList;
import java.util.Iterator;

public class LogicLoop
{
    private final Table table;
    private final Player player;
    private final Direction direction = new Direction();
    private final ArrayList<Integer> commands = new ArrayList<>();

    public LogicLoop(ArrayList<Integer> commands)
    {
        // Read the table size and player start position
        Iterator<Integer> commandIterator = commands.iterator();
        table = new Table(commandIterator.next(), commandIterator.next());
        player = new Player(commandIterator.next(), commandIterator.next());
        commandIterator.forEachRemaining(this.commands::add);
    }

    public void loop()
    {
        Iterator<Integer> commandIterator = commands.iterator();

        // Check to see if the player ever leave the table during the run (not used for the minimum scenario)
//        boolean onTable = true;
//        int failStep = 0;

        // Main loop handling the "game"
        while(commandIterator.hasNext())
        {
            int command = commandIterator.next();
            CommandHandler.handleCommand(command, player, direction);


//            if(onTable)
//            {
//                failStep++;
//                onTable = ValidatePosition.validatePosition(player, table);
//            }
        }


        // Validation of the final position
        if (ValidatePosition.validatePosition(player, table))
        {
//            if (!onTable)
//            {
//                System.out.println("The player fell of the table after command number " + failStep + " was executed!");
//                System.out.println("He then climed back upp and ended on possition: [" + player.getX() + "," + player.getY() + "]");
//            }
//            else
//            {
                System.out.println("[" + player.getX() + "," + player.getY() + "]");
//            }
        }
        else
        {
            System.out.println("[-1,-1]");
        }
    }
}
