package checkIfFileExist;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CheckIfFileExist
{
    public static void main(String[] args)
    {
        System.out.println(checkFileExist());
    }

    static boolean checkFileExist()
    {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        Path path = Paths.get("./" + str);

        if (Files.exists(path))
        {
            return true;
        }
        
        else
            return false;
    }
}
