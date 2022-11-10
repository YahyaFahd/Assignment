import java.util.Scanner;
public class Ex5 {
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


        if ((num1 == num2) && (num2 == num3) && (num1 == num3))
        {
            System.out.println("All the same");
        }
        else if ((num1 != num2) && (num2 != num3)&& (num1 != num3))
        {
            System.out.println("All different");
        }
        else
        {
            System.out.println("Neither");
        }
    }

}
