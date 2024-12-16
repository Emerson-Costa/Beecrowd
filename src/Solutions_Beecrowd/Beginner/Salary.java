package Solutions_Beecrowd.Beginner;

import java.util.Scanner;

public class Salary {

    public void salary (){

        Scanner input = new Scanner(System.in);

        int numberEmployer = input.nextInt();
        double hourWorked = input.nextDouble();
        double value= input.nextDouble();

        double calcValueOfSalary = hourWorked * value;

        String   salary = String.format("%.2f", calcValueOfSalary);

        System.out.printf("NUMBER = " + numberEmployer + "\nSALARY = U$ " + salary + "\n");
    }
}
