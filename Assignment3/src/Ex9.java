public class Ex9 {
    private static String getSesson(int month, int day) {
        String season = "";
        switch (month) {
            case 1:
            case 2:
            case 3:
                season = "Winter";
                if(month % 3 == 0 && day >=21)
                    season = "Spring";
                break;
            case 4:
            case 5:
            case 6:
                season = "Spring";
                if(month % 3 == 0 && day >=21)
                    season = "Summer";
                break;
            case 7:
            case 8:
            case 9:
                season = "Summer";
                if(month % 3 == 0 && day >=21)
                    season = "Fall";
                break;
            case 10:
            case 11:
            case 12:
                season = "Fall";
                if(month % 3 == 0 && day >=21)
                    season = "Winter";
                break;
            default:
                season = "Not a valid month";
                break;
        }
        return season;
    }


    public static void main(String[] args) {
        System.out.println(getSesson(1, 0));
        System.out.println(getSesson(2, 0));
        System.out.println(getSesson(3, 0));
        System.out.println(getSesson(3, 21));
        System.out.println(getSesson(4, 0));
        System.out.println(getSesson(5, 0));
        System.out.println(getSesson(6, 0));
        System.out.println(getSesson(6, 21));
        System.out.println(getSesson(7, 0));
        System.out.println(getSesson(8, 0));
        System.out.println(getSesson(9, 0));
        System.out.println(getSesson(9, 21));
        System.out.println(getSesson(10, 0));
        System.out.println(getSesson(11, 0));
        System.out.println(getSesson(12, 0));
        System.out.println(getSesson(12, 21));
    }

}
