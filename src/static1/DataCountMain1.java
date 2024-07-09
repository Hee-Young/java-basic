package static1;

public class DataCountMain1 {

    public static void main(String[] args) {
        Data data1 = new Data("A");
        System.out.println("A count = " + data1.count);

        Data data2 = new Data("B");
        System.out.println("B count = " + data2.count);

        Data data3 = new Data("C");
        System.out.println("C count = " + data3.count);

        //Counter 클래스 생성하여 count
        Counter counter = new Counter();

        Data2 dataA = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 dataB = new Data2("B", counter);
        System.out.println("B count = " + counter.count);

        Data2 dataC = new Data2("C", counter);
        System.out.println("C count = " + counter.count);
    }
}
