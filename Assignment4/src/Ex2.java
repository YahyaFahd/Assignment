public class Ex2 {

    public static void main(String[] args) {

        String test= "Mississippi";

        String rep1=test.replace("i", "ii");
        int len1=rep1.length();

        System.out.println("the test after replace1 = " +rep1);
        System.out.println("lenght after replace2 = " +len1);

        String rep2=test.replace("ss", "s");
        int len2=rep2.length();

        System.out.println("the test after replace2 = "+rep2);
        System.out.println("lenght after replace2= " +len2);

        String rep3=rep1.replace("ss", "s");
        int len3=rep3.length();

        System.out.println("the test after replace3 from replace1 = "+rep3);
        System.out.println("lenght after replace3 from replace1= " +len3);


    }


}
