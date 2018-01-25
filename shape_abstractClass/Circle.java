package shape_abstractClass;

public class Circle extends Shape
{
    private int r;
    
    @Override
    public double calculateArea()
    {
        
        return 3.14*r*r;
    }

    @Override
    public double calculateCircuit()
    {
        
        return 3.14*2*r;
    }

    public int getR()
    {
        return r;
    }

    public void setR(int r)
    {
        this.r = r;
    }

    public Circle(int r)
    {
        super();
        this.r = r;
    }

    @Override
    public String toString()
    {
        return "Square r= "+r+ " Area= "+ calculateArea()+" Circuit= "+ calculateCircuit() + "";
    }
}
