package main.java.dropoff.logic;

import main.java.dropoff.objects.Matrix;

public class Rotate
{
    public static void rotate(Matrix matrix, double angle)
    {
        // Just a 2d rotation of a vector but could be changed to handle difrent rotations
        int matrixToRotate[][] = new int[matrix.getMatrix().length][matrix.getMatrix()[0].length];
        matrixToRotate[0][0] = (int) (matrix.getMatrix()[0][0]*Math.cos(angle)- matrix.getMatrix()[1][0]*Math.sin(angle));
        matrixToRotate[1][0] = (int) (matrix.getMatrix()[0][0]*Math.sin(angle)+ matrix.getMatrix()[1][0]*Math.cos(angle));
        matrix.setMatrix(matrixToRotate);
    }
}
