package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {
        InterfaceA interfaceA = new Child();
        InterfaceB interfaceB = new Child();

        interfaceA.methodA();
        interfaceA.methodCommon();

        interfaceB.methodB();
        interfaceB.methodCommon();
    }
}
