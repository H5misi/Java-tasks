import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Please enter the initial values. Press enter when done.");

        /**
         * It first reads the whole line and then creates a separate Scanner to parse it.
         * This is a better approach, than using one Scanner & splitting the string,
         * because it avoids the necessity of splitting a string into an array ↩
         * and converting the items manually to integer.
         * The scanner will do that for you.
         */

        // create instance of Scanner class to get I/Ps
        Scanner scan = new Scanner(System.in);

        // store the whole input line in a string
        String str = scan.nextLine();
        // The second Scanner, to automatically split the string
        Scanner lineScanner = new Scanner(str);


        int max, min, input;

        max = min = lineScanner.nextInt();

        while (lineScanner.hasNextInt())
        {

            input = lineScanner.nextInt();

            if (max <= input)
            {
                max = input;
            }
            else if (min >= input)
            {
                min = input;
            }

        }


        int res = max - min;
        System.out.printf("max - min = %d \n", res);

        System.out.println(specialCase(str));

        System.out.println(zone(res, max));


//        String[] arr = str.split(" ", 0);
//        int max = Integer.parseInt(arr[0]);
//        int min = Integer.parseInt(arr[0]);

//        int max = Character.getNumericValue(str.charAt(0));
//        int min = Character.getNumericValue(str.charAt(0));


//        for (int i = 0; i <str.length(); i++)
//        {
////            char c = str.charAt(i);
//            if (str.charAt(i) != ' ')
//            {
//                if (Character.getNumericValue(str.charAt(i)) > max)
//                {
//                    max = Character.getNumericValue(str.charAt(i));
//                }
//                else if (Character.getNumericValue(str.charAt(i)) < min)
//                {
//                    min = Character.getNumericValue(str.charAt(i));
//                }
//            }
//        }

//        for (String s : arr)
//        {
//            if (Integer.parseInt(s) > max)
//            {
//                max = Integer.parseInt(s);
//            }
//            else if (Integer.parseInt(s) < min)
//            {
//                min = Integer.parseInt(s);
//            }
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

    public static String specialCase(String str)
    {
        int isEqual = 0;

//        str = str.replaceAll("\\s", "");

        for (int i = 0; i < str.length() - 1; i++)
        {
            if (Character.getNumericValue(str.charAt(i)) != ' ')
            {
                if (Character.getNumericValue(str.charAt(i)) == Character.getNumericValue(str.charAt(i + 1)))
                {
                    isEqual++;
                }
            }

        }

        if (isEqual == str.length() - 1)
        {
            return "Special case";
        }
        else
        {
            return "";
        }


    }
}