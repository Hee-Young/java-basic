package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student(); // x001;
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사!
        Student[] students = new Student[2];
        students[0] = student1;
        // ==> student[0] = x001; 인스턴스가 복사되는 것이 아니라 변수에 들어 있는 값인 참조값만 복사됨!!!
        students[1] = student2;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
    }
}
