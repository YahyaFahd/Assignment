public class Ex5 {

    public static void main(String[] args) {
        int x = 1, y = 2;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("after change");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
