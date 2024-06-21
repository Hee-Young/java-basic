package class1;

public class ClassDefinition {

    /*
     * 클래스: 설계도(a.k.a 붕어빵 틀)
     *       객체가 가져야할 속성(변수), 기능(메서드) 정의
     *
     * 객체(Object): 클래스에서 정의한 속성과 기능을 가진 실체
     *               서로 독립적인 상태 가짐
     *
     * 인스턴스(Instance): 특정 클래스로부터 생성된 객체
     *                   주로 객체가 어떤 클래스에 속해 있는지 강조할 떄 사용
     *                   객체보다 좀 더 관계에 초점을 맞춘 단어
     *                   ex) student1은 Student의 인스턴스이다.
     *
     * 하지만 둘 다 클래스에서 나온 실체라는 핵심이 같기 때문에 구분하지 않고 사용.
     * */

    public static void main(String[] args) {
        Student student1; //변수 선언
        student1 = new Student();

        /*
         * "Student 클래스 정보를 기반으로 새로운 객체 생성해!"
         * -> 멤버 변수(name, age, grade) 사용하는데 필요한 메모리 공간 함께 확보
         *
         * Student student1 = x001; 객체 생성 후 참조값 반환
         * student1 = x001;
         */

        //객체 값 대입
        student1.name = "학생1"; // == x001.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // 객체 또는 인스턴스 (a.k.a 붕어빵) 생성
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
    }
}
