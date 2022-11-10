public class Ex3 {


    public static void main(String[] args) {
        System.out.print("product of the first ten integers: ");
        System.out.println(1*2*3*4*5*6*7*8*9*10);
        //second methoud
        int multiplcation = 1;
        for (int i = 1; i <= 10; i++) {
            multiplcation *= i;
        }
        System.out.println("multiplcation of the first ten numbers = " + multiplcation);


    }
}