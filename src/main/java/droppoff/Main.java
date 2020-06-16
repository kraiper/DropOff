package main.java.droppoff;

import main.java.droppoff.logic.LogicLoop;
import main.java.droppoff.tools.Reader;

public class Main
{

    public static void main(String[] args)
    {

        LogicLoop logicLoop = new LogicLoop(Reader.readInput(args));
        logicLoop.loop();

    }

}
