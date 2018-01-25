package shape_abstractClass;

public class Rectangle extends Shape
{
    private int a;
    private int b;

    @Override
    public double calculateArea()
    {
        return a * b;

    }

    @Override
    public double calculateCircuit()
    {
        return 2 * a + 2 * b;

    }

    public Rectangle(int a, int b)
    {
        super();
        this.a = a;
        this.b = b;
    }

    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public int getB()
    {
        return b;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    @Override
    public String toString()
    {
        return "Rectangle a= " + a + " b= " + b + " Area= " + calculateArea() + " Circuit= " + calculateCircuit() + "";
    }
}
