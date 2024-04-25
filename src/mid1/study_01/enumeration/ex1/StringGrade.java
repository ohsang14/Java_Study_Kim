package mid1.study_01.enumeration.ex1;

public class StringGrade {
    public static final String BASIC = "BASIC";
    public static final String GOLD = "GOLD";
    public static final String DIAMOND = "DIAMOND";

    public int discount(String grade, int price){
        int discountPercent = 0;
        if (grade.equals(StringGrade.BASIC)) {
            discountPercent = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            discountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercent = 30;
        }else{
            System.out.println(grade + ": 할인x");
        }
        return price * discountPercent / 100;
    }
}
