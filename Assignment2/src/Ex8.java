import java.util.Scanner;
public class Ex8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num ;
        System.out.println("enter number");
        num=input.nextDouble();

        System.out.printf("Square: %12.2f\n", num * num);
        System.out.printf("Cube: %14.2f\n", num * num * num);
        System.out.printf("Fourth power: %6.2f\n", Math.pow(num, 4));
    }

}

