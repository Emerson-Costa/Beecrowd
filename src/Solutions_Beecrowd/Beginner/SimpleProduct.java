package Solutions_Beecrowd.Beginner;

import java.util.Scanner;

public class SimpleProduct {

    public void prodValues(){

        Scanner input = new Scanner(System.in);

        Integer numberOne = input.nextInt();
        Integer numberTwo = input.nextInt();

        System.out.println("PROD = " + (numberOne * numberTwo));
    }
}
