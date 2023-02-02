import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Input a number between 1 & 7 (week days): ");

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        num--;

        switch (num)
        {
            case 0: //Saturday
                for (int i = 1; i <= 5; i++)
                {
                    if (i == 3)
                    {
                        System.out.println();
                        i++;
                    }
                    for (int j = 5 - i; j > 0; j--)
                    {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i + (i - 1); k++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 1: //Sunday
            case 2: //monday
                System.out.print("Enter the size of the array: ");
                int size = scan.nextInt();
                int[] arr = new int[size];

                System.out.println("Enter the elements:");
                for (int i = 0; i < size; i++)
                {
                    arr[i] = scan.nextInt();
                }
                int sum = 0;
                for (int j = 0; j < size; j++)
                {
                    sum += arr[j];
                }

                System.out.println("The average of array elements is: " + (sum / size));
                break;
            case 3: //Tuesday
                break;
            case 4: //Wednesday
                System.out.println("Enter a 3Χ3 matrix elements: ");
                int[][] squareMatrix = new int[3][3];
                for (int i = 0; i < 3; i++)
                {
                    for (int j = 0; j < 3; j++)
                    {
                        squareMatrix[i][j] = scan.nextInt();
                    }
                }

                System.out.println("Square matrix elements:");
                for (int i = 0; i < 3; i++)
                {
                    for (int j = 0; j < 3; j++)
                    {
                        System.out.print(squareMatrix[i][j] + "\t");
                    }
                    System.out.println();
                }
                break;
            case 5: //Thursday
                System.out.println("Enter the 4 elements of the array: ");
                int[] incrementMatrix = new int[4];

                for (int i = 0; i < incrementMatrix.length; i++)
                {
                    incrementMatrix[i] = scan.nextInt();
                }

                incrementMethod(incrementMatrix);

                System.out.println("Elements after increment by 5:");
                for (int i = 0; i < incrementMatrix.length; i++)
                {
                    System.out.println(incrementMatrix[i]);
                }
                break;
            case 6: // Friday
                System.out.print("Enter number of repetitions | float number | string: ");
                var input = scan.next();

                int repeatTimes;
                float flt;
                String str;

                try
                {
                    repeatTimes = Integer.parseInt(input);
                    overloadingMethod(repeatTimes);
                }
                catch (NumberFormatException e)
                {
                    try
                    {
                        flt = Float.parseFloat(input);
                        overloadingMethod(flt);
                    }
                    catch (Exception ex)
                    {
                        str = String.valueOf(input);
                        overloadingMethod(str);
                    }
                }

                break;
            default:
                System.out.println("Please enter valid number between 1 - 7:");
        }

    }

    public static void incrementMethod(int[] incrementMatrix)
    {
        for (int i = 0; i < incrementMatrix.length; i++)
        {
            incrementMatrix[i] += 5;
        }
    }

    public static void overloadingMethod(int repeatTimes)
    {
        for (int i = 0; i < repeatTimes; i++)
        {
            System.out.println("OOP");
        }
    }

    public static void overloadingMethod(float flt)
    {
        flt *= 3.0;
        System.out.println(flt);
    }

    public static void overloadingMethod(String str)
    {
        System.out.println("Hello " + str);
    }
}
