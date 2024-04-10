package mid1.study_01.lang.Immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");

        System.out.println("str = " + str1);
        System.out.println("str = " + str2);
    }
}
