package extends1.ex1;

public class ElectricCar extends Car {

    @Override // 옵션이지만 혹시 모를 실수 방지를 위해 쓰는 것이 좋음
    public void move() {
        System.out.println("전기차를 움직입니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
