package HashSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("Minsk");
        set.add("Grodno");
        set.add("Vitebsk");
        set.add("Borisov");
        set.add("Minsk");
        System.out.println(set);
        SortedSet<String> subSet = set.subSet("Borisov", "Vitebsk");
        System.out.println(set.first());
    }
}
