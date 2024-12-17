package Solutions_Beecrowd.Beginner;

import java.util.Scanner;

public class SalaryWithBonus {

    public void salaryWithBonus(){
        Scanner input = new Scanner(System.in);

        String nameSeller = input.nextLine();
        double salary = input.nextDouble();
        double valueProductsSold = input.nextDouble();

        double bonus = (0.15 * valueProductsSold);

        double salaryWithBonus = salary + bonus;

        System.out.printf("TOTAL = R$ %.2f%n", salaryWithBonus);
    }
}
