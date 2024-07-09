package static2;

import static static2.DecoData.*;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData decoData = new DecoData();
        decoData.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData decoData2 = new DecoData();
        decoData2.instanceCall();

        //인스턴스를 통한 접근 : 가능은 하지만 사용하지 않는 것이 좋음
        decoData2.staticCall();

        //클래스를 통한 접근
        staticCall();
    }
}
