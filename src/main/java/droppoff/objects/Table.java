package main.java.droppoff.objects;

import java.util.Arrays;

public class Table extends Matrix
{
    int tableSizeX;
    int tableSizeY;

    public Table(int sizeX, int sizeY)
    {
        tableSizeX = sizeX;
        tableSizeY = sizeY;
        matrix = new int[tableSizeX][tableSizeY];
        // The entire table is valid for this task
        for(int i = 0; i < tableSizeX; i++)
        {
            Arrays.fill(matrix[i], 1);
        }
    }

    public int getTableSizeX()
    {
        return tableSizeX;
    }

    public int getTableSizeY()
    {
        return tableSizeY;
    }
}
