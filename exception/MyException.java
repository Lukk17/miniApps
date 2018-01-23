package exception;

public class MyException
{
    public static void main(String[] args)
    {
        int[] elements = { 2, 4, 5, 7 };
        int value = 6;
        try
        {
            System.out.println(elementExist(elements, value));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    static int elementExist(int[] elements, int value) throws Exception
    {
        for (int i = 0; i < elements.length; i++)
        {
            if (value == elements[i])
            {
                return elements[i];
            }
        }
        
        throw new Exception("There is no such number!");
    }
}
