package Solutions_Beecrowd.Beginner;

import java.util.Scanner;

public class Average2 {

    public void average2(){

        Scanner input = new Scanner(System.in);

        double numberOne = input.nextDouble();
        double numberTwo = input.nextDouble();
        double numberTree = input.nextDouble();

        double average = ((numberOne * 2) + (numberTwo  * 3) + (numberTree  * 5)) / (2 + 3 + 5);

        String   result = String.format("%.1f", average);
        System.out.println("MEDIA = " + result);
    }
}