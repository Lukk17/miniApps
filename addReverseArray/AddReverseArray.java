package addReverseArray;

import java.util.Arrays;

public class AddReverseArray
{
    public static void main(String[] args)
    {
        int[] tab = { 2, 3, 4, 6 };
        int[] tab2 = append(tab);

        for (int i = 0; i < tab.length; i++)
        {
            tab2[tab.length + i] = tab[tab.length - 1 - i];
        }

        System.out.print(Arrays.toString(tab2));
    }

    static int[] append(int[] arr)
    {
        return Arrays.copyOf(arr, (2 * arr.length));
    }
}
