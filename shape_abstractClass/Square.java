package shape_abstractClass;

public class Square extends Shape
{
    private int a;

    @Override
    public double calculateArea()
    {
        return a*a;
        
    }

    @Override
    public double calculateCircuit()
    {
        return 4*a;
        
    }

    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public Square(int a)
    {
        super();
        this.a = a;
    }

    @Override
    public String toString()
    {
        return "Square a= "+a+ " Area= "+ calculateArea()+" Circuit= "+ calculateCircuit() + "";
    } 
}
