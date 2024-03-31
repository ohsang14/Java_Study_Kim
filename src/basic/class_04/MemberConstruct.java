package basic.class_04;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    public MemberConstruct(String name, int age, int grade) {
        System.out.println("이름:" + name +
                "나이: " + age+
                "성적: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
