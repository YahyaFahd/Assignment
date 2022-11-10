import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        double x,y,z,avg;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three Number ");
        x=in.nextDouble();
        y=in.nextDouble();
        z=in.nextDouble();
        avg=(x+y+z)/3.0;
        System.out.println("The Average is "+avg);
    }
}
