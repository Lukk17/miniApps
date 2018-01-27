package symulatorLOTTO;

import java.util.Arrays;
import java.util.Collections;

public class Draw
{
    public static int[] randNumbers()
    {
        /**
         * generate array with 6 random numbers
         * 
         * 
         */
        Integer[] arr = new Integer[49];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (i + 1);
        }

        Collections.shuffle(Arrays.asList(arr));                                                                                                //shuffle list to randomize numbers

        int[] arr2 = new int[6];
        for (int i = 0; i < arr2.length; i++)                                                                                                   //creating new array with first 6 numbers of randomized list
        {
            arr2[i] = arr[i];

        }
        System.out.println(Arrays.toString(arr2));
        return arr2;
    }
}
