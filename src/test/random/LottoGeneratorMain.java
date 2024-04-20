package test.random;

import mid1.study_01.math.LottoGenerator;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumber = generator.generate();

        System.out.print("로또 번호:" );
        for (int i : lottoNumber) {
            System.out.print(i+ " ") ;
        }
    }
}
