package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for(int i = 0; i < studentNames.length; i++){
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);
        }

        /*
        * 배열을 사용하게 되면 (ClassStart1에 비해) 코드는 최소화할 수 있지만
        * 데이터를 변경할 때 굉장히 조심해야한다. => 관리하기 좋지 않은 코드
        * */
    }
}
