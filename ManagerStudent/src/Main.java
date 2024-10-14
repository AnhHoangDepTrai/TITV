//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();

        Student s1 = new Student("MS01", "Do Anh Hoang", 23,9.1f);
        Student s2 = new Student("MS02", "Do Anh minh", 23,3.6f);
        Student s3 = new Student("MS03", "Do Huy Anh", 23,1.09f);
        Student s4 = new Student("MS04", "Do Ma", 23,6.6f);
        Student s5 = new Student("MS05", "Do Quy", 23,2.0f);

        sm.addStudent(s1);
        sm.addStudent(s2);
        sm.addStudent(s3);
        sm.addStudent(s4);
        sm.addStudent(s5);

        sm.printList();
        System.out.println("_________________________\n");
        Student s6 = new Student("MS06", "Do Ac Quy", 23,2.2f);
//        sm.addStudent(s6);
        System.out.println(sm.findStudent(s6));
        System.out.println("_________________________\n");
        Student s7 = new Student("MS01", "Do Tieu Quy", 23,10.0f);
        sm.updateStudent(s7);
        sm.printList();
        System.out.println("_________________________\n");

        Student s8 = new Student("MS05", "Do Tieu Quy", 22,10.0f);
        sm.addStudent(s8);
        System.out.println("So sinh vien ten la: " + sm.countStudents("Do Tieu Quy"));

        sm.deleteStudent(s1);
        sm.printList();
    }
}