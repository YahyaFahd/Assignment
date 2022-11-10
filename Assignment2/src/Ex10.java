public class Ex10 {

    public static void main(String[] args) {
        int num1, num2, sum, dif, pr,dist, max, min;
        double avg;

        num1=20;
        num2=25;
        sum = num1+num2 ;
        dif= num1 - num2;
        pr= num1 * num2;
        avg =(double) (num1 + num2) / 2;
        dist= Math.abs(num1 - num2);
        max=num2;
        min=num1;
        System.out.printf("%-20s%3d\n", "Sum ",sum);
        System.out.printf("%-20s%3d\n", "Difference ",dif);
        System.out.printf("%-20s%3d\n", "Product ", pr);
        System.out.printf("%-20s%2.2f\n", "Average ", avg);
        System.out.printf("%-20s%3d\n", "Distance ",dist);
        System.out.printf("%-20s%3d\n", "Max ", max);
        System.out.printf("%-20s%3d\n", "Min ",min);
    }

}
