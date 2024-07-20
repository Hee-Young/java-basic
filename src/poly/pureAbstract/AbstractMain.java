package poly.pureAbstract;

public class AbstractMain {

    public static void main(String[] args) {
        //추상클래스 생성 불가
        //Animal animal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        moveAnimal(cat);

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(Animal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
