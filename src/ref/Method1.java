package ref;

public class Method1 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "학생1";
        s1.age = 18;
        s1.grade = 90;

        Student s2 = new Student();
        s2.name = "학생2";
        s2.age = 19;
        s2.grade = 80;

        printStudent(s1);
        printStudent(s2);
    }

    static void printStudent(Student s) {
        System.out.println("이름 : " + s.name
                            + ", 나이 : " + s.age
                            + ", 성적 : " + s.grade);
    }
}
