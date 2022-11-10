public class Ex2 {

    public static void main(String[] args) {

        System.out.print("sum of the first ten positive integers: ");
        System.out.println(1+ 2 +3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
        //second methoud
        int sum=0;
        for(int i=0; i<=10; i++){
            sum+=i;
        }
        System.out.println("sum ten numbers = " +sum);

    }
}
