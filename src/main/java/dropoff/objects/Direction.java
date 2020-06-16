package main.java.dropoff.objects;

public class Direction extends Matrix
{
    public Direction()
    {
        matrix = new int[2][1];
        matrix[0][0] = 0;
        matrix[1][0] = -1;
    }

    public int getX()
    {
        return matrix[0][0];
    }

    public int getY()
    {
        return matrix[1][0];
    }
}
