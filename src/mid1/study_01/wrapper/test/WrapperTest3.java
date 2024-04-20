package mid1.study_01.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100"  ;

        // String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 =" + integer1);

        // integer - > int
        int intValue = integer1.intValue();
        System.out.println("intValue =" + intValue);

        // int -> Integer
        Integer integer = Integer.valueOf(intValue);
        System.out.println("integer2 = "+ integer);
    }
}
