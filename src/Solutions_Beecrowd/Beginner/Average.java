package Solutions_Beecrowd.Beginner;

import java.util.Scanner;

public class Average {

    public void average(){

        Scanner input = new Scanner(System.in);

        double numberOne = input.nextDouble();
        double numberTwo = input.nextDouble();

        double average = ((numberOne * 3.5) + (numberTwo  * 7.5)) / (3.5 + 7.5);

        String   result = String.format("%.5f", average);
        System.out.println("MEDIA = " + result);
    }
}