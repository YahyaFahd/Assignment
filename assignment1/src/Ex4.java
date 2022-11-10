public class Ex4 {

    public static void main(String[] args) {
        double balance = 1000;
        double interestPerYear = 0.05;
        double balAfterOneYear = (balance * interestPerYear) + balance;
        double balAfterSecoundYear = (balAfterOneYear * interestPerYear) + balAfterOneYear;
        double balanceAfterThreeyear = (balAfterSecoundYear * interestPerYear) + balAfterSecoundYear;
        System.out.println("balance after the first year = " + balAfterOneYear);
        System.out.println("balance after secound year = " + balAfterSecoundYear);
        System.out.println("balance after three years = " + balanceAfterThreeyear);

    }
}