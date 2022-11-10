public class Ex3 {

    public static void main(String[] args) {

        String test = "Mississippi";
        String res;

        res = test.replace('i', '!');
        res = res.replace('s', '$');

        System.out.println("expected result = M!$$!$$!pp!");
        System.out.println("actual result =" + res);


    }
}