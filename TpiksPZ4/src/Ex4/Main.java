package Ex4;

import HashSet.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;

import static Ex4.Student.printStudents;
import static Ex4.Student.removeStudents;

public class Main {
    public static void main(String[] args) {

        List<Student> students=new LinkedList<>();
        Student st1= new Student("Margo","160801", 2, 8.0);
        Student st2= new Student("Vesta","162101", 2, 8.0);
        Student st3= new Student("Kostya","052302", 3, 2.8);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        removeStudents(students);
        System.out.println();
        printStudents(students, 3);
    }
}
