/*
 * Program Name: LinkedHashSetExample
 * Problem Statement: LinkedHashSet add and print elements
 */
import java.util.LinkedHashSet;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> city= new LinkedHashSet<>();
        city.add("Pollachi");
        city.add("Udumalpet");
        city.add("Palani");
        city.add("Coimbatore");
        city.add("Dindugul");
        city.add("Udumalpet");
        System.out.println("City Names "+city);

        LinkedHashSet<Integer> Number= new LinkedHashSet<>();
        Number.add(28);
        Number.add(79);
        Number.add(88);
        Number.add(73);
        Number.add(99);
        Number.add(28);
        System.out.println("Numbers of "+Number);
    }
}
