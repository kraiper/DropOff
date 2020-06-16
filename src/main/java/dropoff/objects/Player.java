package main.java.dropoff.objects;

public class Player extends Matrix
{

    public Player(int positionX, int positionY)
    {
        matrix = new int[2][1];
        matrix[0][0] = positionX;
        matrix[1][0] = positionY;
    }

    public int getX()
    {
        return matrix[0][0];
    }

    public int getY()
    {
        return matrix[1][0];
    }

    public void setPossition(int x, int y)
    {
        matrix[0][0] = x;
        matrix[1][0] = y;
    }
}
