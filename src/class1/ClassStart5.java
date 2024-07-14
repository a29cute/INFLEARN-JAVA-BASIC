package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student(); // 학생1 메모리 생성
        student1.name = "학생1"; // 생성한 객체의 멤버변수에 접근하려면 .(dot)을 사용한다.
        student1.age = 17;
        student1.grade = 90;

        Student student2 = new Student(); // 학생2 메모리 생성
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 80;

        Student[] students = {student1, student2}; // 배열선언 최적화하기(리팩토링)

        for (int i = 0; i < students.length; i++) {

            Student s = students[i];
            System.out.println("이름 : " + s.name
                    + ", 나이: " + s.age
                    + ", 성적: " + s.grade);
        }
    }
}
