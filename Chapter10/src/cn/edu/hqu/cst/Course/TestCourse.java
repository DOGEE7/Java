package cn.edu.hqu.cst.Course;

public class TestCourse {
    public static void main(String[] args){
        Course course1 = new Course("Java");
        Course course2 = new Course("Android");

        course1.addStudent("JinYani");
        course1.addStudent("ChenWenlin");
        course1.addStudent("MengYeying");
        course1.addStudent("ChenLiping");

        course2.addStudent("ZengZijie");
        course2.addStudent("ZengJunjie");

        System.out.println("Numbers of students in coursel(" + course1.getCourseName() +  "): " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0;i < course1.getNumberOfStudents();i++){
            System.out.print(students[i] + ", ");
        }

        System.out.println();
        System.out.print("Numbers of students in course2("+ course2.getCourseName() +  "): " + course2.getNumberOfStudents());
    }
}
