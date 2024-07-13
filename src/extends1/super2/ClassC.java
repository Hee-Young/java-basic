package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        //super(); //ClassB는 기본 생성자가 없기 때문에 사용할 수 없음, 컴파일 오류
        super(10); // 기본 생성자 생략 가능
        System.out.println("ClassC 생성자");
    }
}
