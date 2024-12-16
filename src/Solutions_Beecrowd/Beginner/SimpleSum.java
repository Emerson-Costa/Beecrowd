package Solutions_Beecrowd.Beginner;

import java.util.Scanner;
public class SimpleSum {

    public void sumValues(){

        Scanner input = new Scanner(System.in);

        Integer numberOne = input.nextInt();
        Integer numberTwo = input.nextInt();

        System.out.println("SOMA = " + (numberOne + numberTwo));
    }
}
