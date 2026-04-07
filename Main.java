import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter dimension (2 or 3): ");
            int dim = sc.nextInt();

            // Dimension guard before even reading values
            if (dim != 2 && dim != 3)
            {
                throw new VectorException("Vectors of only either 2D or 3D allowed.");
            }

            double[] arr1 = new double[dim];
            double[] arr2 = new double[dim];

            System.out.println("Enter " + dim + " components for Vector 1:");
            for (int i = 0; i < dim; i++)
            {
                arr1[i] = sc.nextDouble();
            }

            System.out.println("Enter " + dim + " components for Vector 2:");
            for (int i = 0; i < dim; i++)
            {
                arr2[i] = sc.nextDouble();
            }

            Vectors v1 = new Vectors(arr1);
            Vectors v2 = new Vectors(arr2);

            System.out.print("Vector 1: ");
            v1.printVector();

            System.out.print("Vector 2: ");
            v2.printVector();

            // Addition
            Vectors sum = v1.add(v2);
            System.out.print("Addition: ");
            sum.printVector();

            // Subtraction
            Vectors diff = v1.subtract(v2);
            System.out.print("Subtraction: ");
            diff.printVector();

            // Dot Product
            double dot = v1.dotProduct(v2);
            System.out.println("Dot Product: " + dot);
        }
        catch (VectorException e)
        {
            System.out.println("VectorException: " + e.getMessage());
        }

        sc.close();
    }
}
