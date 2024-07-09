package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        //인스턴스를 통한 변수 접근 -> 사용 가능하긴 하지만 인스턴스 변수인지 static 변수인지 바로 분별하기 어려워 사용 지양.
        System.out.println("C count = " + data3.count);
    }
}
