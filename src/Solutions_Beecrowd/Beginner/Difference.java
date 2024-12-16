package Solutions_Beecrowd.Beginner;
import java.util.Scanner;

public class Difference{

    public void difference(){

        Scanner input = new Scanner(System.in);

        int A, B, C, D;

        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        int result = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + result);
    }
}
