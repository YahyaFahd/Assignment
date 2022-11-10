import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {

        System.out.println("I can calculate your weekly pay.");
        // get ready to read the user data
        Scanner keyboard = new Scanner(System.in);
        // prompt the user for hourlyWage
        // store the user input
        System.out.print("Please enter your hourly wage, you can enter fractions too: ");
        final double HOURLY_WAGE = keyboard.nextDouble();

        // prompt the user for hoursWorked
        // store the user input
        System.out.print("Please enter number hours you worked this week, you can enter fractions too: ");
        final double HOURS_WORKED = keyboard.nextDouble();

        // declare variables and set to 0
        double payAmount = 0;
        double otPayAmount = 0;
        double totalPay = 0;
        // do the calculation
        if (HOURS_WORKED > 40){
            payAmount = HOURS_WORKED * 40 ;
            otPayAmount = (HOURS_WORKED - 40 ) * (HOURLY_WAGE * 1.5) ;
            totalPay = payAmount + otPayAmount ;
        }
        else{
            totalPay = HOURLY_WAGE * HOURS_WORKED ;
        }

        System.out.printf("You worked %5.2f hours and your normal rate of pay is $%4.2f ", HOURS_WORKED, HOURLY_WAGE );
        System.out.printf("\nYour overtime pay is $%5.2f and your total paycheck is $%10.2f \n ", otPayAmount, totalPay );

    }
}
