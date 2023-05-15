package Ex4;

import java.util.Iterator;
import java.util.List;

public class Student {
    protected String name;
    protected String group;
    protected static int course;
    protected double rating;

    public Student(String name, String group, int course, double rating) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.rating = rating;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public static void removeStudents(List<Student> students) {
        students.removeIf(student -> student.getRating()<3);
        for(Student s:students){
            course+=1;
            System.out.println(s.name+"  на следующий курс");
        }
    }

    protected static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (Student.course == course) {
                System.out.println(student.name+" "+ course);
            }
        }
    }
}
