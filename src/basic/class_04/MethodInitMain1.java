package basic.class_04;

import java.lang.reflect.Member;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit memberInit1 = new MemberInit();
        memberInit1.name = "user1";
        memberInit1.age = 15;
        memberInit1.grade = 90;

        MemberInit memberInit2 = new MemberInit();
        memberInit2.name = "user2";
        memberInit2.age = 16;
        memberInit2.grade = 80;

        MemberInit[] memberInits = {memberInit1,memberInit2};

        for (MemberInit s : memberInits) {
            System.out.println("이름:" + s.name +
                    "나이: " + s.age+
                    "성적: " + s.grade);
        }
    }
}
