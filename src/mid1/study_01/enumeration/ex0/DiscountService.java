package mid1.study_01.enumeration.ex0;

public class DiscountService {
    public int discount(String grade, int price){
        int discountPercent = 0;
        if (grade.equals("BASiC")) {
            discountPercent = 10;
        } else if (grade.equals("GOLD")) {
            discountPercent = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPercent = 30;
        }else{
            System.out.println(grade + ": 할인x");
        }
        return price * discountPercent / 100;
    }
}
