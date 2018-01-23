package printTriangle;

import java.util.Scanner;

public class PrintTriangle
{
    public static void main(String[] args)
    {
        printTriangle();
    }

    static void printTriangle()
    {
        Scanner scan = new Scanner(System.in);

        int ilosc = scan.nextInt();

        for (int i = 1; i <= ilosc; i++)
        {
            String row = "";
            
            for (int j = 1; j <= i; j++)
            {
                row += "x";
            }
            
            System.out.print(row + "\n");
        }
    }
}
