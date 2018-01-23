package dogAge;

public class DogAge
{
    public static void main(String[] args)
    {
        System.out.print(dogAge(5));
    }

    static double dogAge(double dogAge)
    {
        double age = 0;
        if (dogAge <= 2)
        {
            return dogAge * 10.5;
        }
        else
        {
            return (2 * 10.5) + ((dogAge - 2) * 4);
        }
    }
}
