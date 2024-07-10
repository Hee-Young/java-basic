package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){
        //private로 인스턴스 생성 막기
    }

    public static int sum(int[] values) {
        int total = 0;
        for(int i : values){
            total += i;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for(int i : values){
            if(i < minValue){
                minValue = i;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for(int i : values){
            if(i > maxValue){
                maxValue = i;
            }
        }
        return maxValue;
    }
}
