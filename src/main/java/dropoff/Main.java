package main.java.dropoff;

import main.java.dropoff.logic.LogicLoop;
import main.java.dropoff.tools.Reader;

public class Main
{

    public static void main(String[] args)
    {

        LogicLoop logicLoop = new LogicLoop(Reader.readInput(args));
        logicLoop.loop();

    }

}
