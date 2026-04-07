public class Vectors {

    public double[] vectorInput;
    public int dimension;

    // Constructor
    public Vectors(double[] values) throws VectorException 
    {
        // FIX: values.length is an int, it can never be null
        if (values == null || values.length == 0) 
        {
            throw new VectorException("Invalid vector components.");
        }

        if (values.length != 2 && values.length != 3) 
        {
            throw new VectorException("Vectors of only either 2D or 3D allowed.");
        }

        this.dimension = values.length;
        this.vectorInput = new double[dimension];

        for (int i = 0; i < dimension; i++) 
        {
            vectorInput[i] = values[i];
        }
    }

    // Addition of vectors
    public Vectors add(Vectors v) throws VectorException 
    {
        checkDimensions(v);

        double[] result = new double[dimension];

        for (int i = 0; i < dimension; i++) 
        {
            result[i] = this.vectorInput[i] + v.vectorInput[i];
        }

        return new Vectors(result);
    }

    // Subtraction of vectors
    public Vectors subtract(Vectors v) throws VectorException 
    {
        checkDimensions(v);

        double[] result = new double[dimension];

        for (int i = 0; i < dimension; i++) 
        {
            result[i] = this.vectorInput[i] - v.vectorInput[i];
        }

        return new Vectors(result);
    }

    // Dot product of vectors — returns a single double value
    public double dotProduct(Vectors v) throws VectorException 
    {
        checkDimensions(v);

        double result = 0;

        // FIX: use * for dot product, not +
        for (int i = 0; i < this.dimension; i++) 
        {
            result += this.vectorInput[i] * v.vectorInput[i];
        }

        return result;
    }

    // Dimension check helper — throws VectorException if dimensions differ
    public void checkDimensions(Vectors v) throws VectorException 
    {
        if (this.dimension != v.dimension) 
        {
            throw new VectorException("Dimensions must be equal.");
        }
    }

    // Display the vector
    public void printVector() 
    {
        System.out.print("( ");
        for (int i = 0; i < dimension; i++) 
        {
            System.out.print(vectorInput[i]);
            if (i < dimension - 1) 
            {
                System.out.print(", ");
            }
        }
        System.out.println(" )");
    }
}
