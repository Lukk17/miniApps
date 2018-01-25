package shape_abstractClass;

public abstract class Shape
{
    protected double area;
    protected double circuit;
    protected String color;
    
    public abstract double calculateArea();
    public abstract double calculateCircuit();
    
    public double getArea()
    {
        return area;
    }
    public void setArea(double area)
    {
        this.area = area;
    }
    public double getCircuit()
    {
        return circuit;
    }
    public void setCircuit(double circuit)
    {
        this.circuit = circuit;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
}
