package HashSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class ComparePersonDemo {
    public static void main(String[] args) {
        SortedSet<Person> set=new TreeSet<>();
        set.add(new Person("Sasha", "Ivanov", 36));
        set.add(new Person("Masha", "Petrov", 27));
        set.add(new Person("Margo", "Baranovskaya", 18));
        set.forEach(System.out::println);
    }
}
