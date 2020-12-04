import java.util.ArrayList;

/**
 * @author Franco Salcedo Castro
 *
 */

public class Matrix
{
    public static void main(String[] args)
    {
        int matrix[][] = {
                {5,15,11},
                {10,95,3},
                {66,12,95},
        };

        System.out.println("La matriz antes de la rotación: ");
        draw(matrix);
        System.out.println("Matriz rotada: ");
        transpose(matrix);
        reverse(matrix);
        draw(matrix);
    }

    public static void reverse(int matrix[][])
    {
        int k;
        int mlength = matrix.length;

        for (int i = 0; i < mlength; i++)
        {
            k = mlength - 1;
            for (int j = 0; j < k; j++)
            {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[k][i];
                matrix[k][i] = temp;
                k--;
            }
        }
    }

    public static void transpose(int matrix[][])
    {
        int i, j;
        int mlength = matrix.length;

        for(i=0; i<mlength; i++)
        {
            for(j=i; j<mlength; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void draw(int matrix[][])
    {
        int i, j;
        int mlength = matrix.length;

        for(i=0; i<mlength; i++)
        {
            for(j=0; j<mlength; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}