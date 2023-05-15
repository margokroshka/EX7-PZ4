package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> set =new LinkedHashSet<>();
        set.add("Beta");
        set.add("Alpha");
        set.add("Omega");
        set.add("Gamma");
        set.add("Ate");
        System.out.println(set);
    }
}
