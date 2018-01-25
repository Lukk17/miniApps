package shape_abstractClass;

import java.util.ArrayList;
import java.util.List;

public class Shape_abstractClass
{
    public static void main(String[] args)
    {
        List<Shape> list = new ArrayList<>();
        list.add(new Square(5));
        list.add(new Circle(5));
        list.add(new Rectangle(4, 5));
        
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}
