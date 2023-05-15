package HashSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class PersonComparatorDemo {
    public static void main(String[] args) {
       main1();
    }

    static void main1(){
        PersonComparator personComparator=new PersonComparator();
        SortedSet<Person> set=new TreeSet<>(personComparator);
        set.add(new Person("Sasha", "Ivanov", 36));
        set.add(new Person("Masha", "Petrov", 27));
        set.add(new Person("Margo", "Baranovskaya", 18));
        set.add(new Person("Kolya", "Ivanov", 16));
        set.forEach(System.out::println);
    }
    void main2() {
        Comparator<Person> personComparator=
                Comparator.comparing(Person::getLastName).thenComparing(Person::getAge);
        SortedSet<Person> set=new TreeSet<>(personComparator);
        set.add(new Person("Sasha", "Ivanov", 36));
        set.add(new Person("Masha", "Petrov", 27));
        set.add(new Person("Margo", "Baranovskaya", 18));
        set.add(new Person("Kolya", "Ivanov", 16));
        set.forEach(System.out::println);
    }
}
