package main.java.dropoff.tools;

import java.util.ArrayList;
import java.util.Scanner;

public class Reader
{
    public static ArrayList<Integer> readInput(String args[])
    {
        if (args.length > 1)
        {
            return createCommandArray(args);
        }
        // Possibility to add support for file reading if args length is 1
        else
        {
            return readInput();
        }
    }

    public static ArrayList<Integer> readInput()
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> commands = new ArrayList<>();
        int input = scanner.nextInt();
        while (input != 0)
        {
            commands.add(input);
            input = scanner.nextInt();
        }
        commands.add(input);
        return commands;
    }

    private static ArrayList<Integer> createCommandArray(String input[])
    {
        ArrayList<Integer> commands = new ArrayList<>();
        for (String s: input)
        {
            commands.add(Integer.parseInt(s));
        }
        return commands;
    }


}
