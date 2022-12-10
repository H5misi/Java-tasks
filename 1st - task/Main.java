import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        String[] arr = str.split(" ", 0);
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);

        for (String s : arr)
        {
            if (Integer.parseInt(s) > max)
            {
                max = Integer.parseInt(s);
            }
            else if (Integer.parseInt(s) < min)
            {
                min = Integer.parseInt(s);
            }
        }

        int res = max - min;
        System.out.printf("max - min = %d \n", res);

        System.out.println(specialCase(arr));

        System.out.println(zone(res, max));

//        while (scan.hasNextLine())
//        {
//        }


    }

    public static String zone(int res, int max)
    {
        String dan = "Dangerous zone";
        String safe = "Safe zone";
        if (res < (max / 2))
        {
            return dan;
        }
        else
        {
            return safe;
        }
    }

    public static String specialCase(String[] arr)
    {
        int i = 0;
        boolean flag = false;

        for (int j = 0; j < arr.length; j++)
        {
            if (Integer.parseInt(arr[i]) == Integer.parseInt(arr[i + 1]))
            {
                flag = true;
            }
        }

        if (flag)
        {
            return "Special case";
        }
        else
        {
            return null;
        }


    }
}