import java.util.Scanner;
public class Ex6 {

    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1= ");
        num1 = input.nextDouble();

        System.out.println("Enter num2= ");
        num2 = input.nextDouble();

        System.out.println("Enter num3= ");
        num3 = input.nextDouble();


        System.out.println((num1 > num2 == true) && (num2 > num3 == true)? "Decreasing":
                (num1 < num2 == true) && (num2 < num3 == true)? "Increasing": "Neither");
    }
}
