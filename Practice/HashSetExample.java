/*
 * Program Name: HashSetExample
 * Problem Statement: HashSet add elements and nulls
 */
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        words.add("BMW");
        words.add("Audi");
        words.add("RR");
        words.add("BMW");
        words.add("Toyato");
        words.add(null);
        System.out.println("values: "+words);
              
        HashSet<Integer> Marks = new HashSet<>();
        Marks.add(75);
        Marks.add(55);
        Marks.add(95);
        Marks.add(58);
        Marks.add(79);
        Marks.add(88);
        Marks.add(null);
        System.out.println("marks"+Marks);

        System.out.println("The BMW is present? "+words.contains("BMW"));
        System.out.println("The marks 95 is present? "+Marks.contains(95));

        System.out.println("Removal of RR "+words.remove("RR"));
        System.out.println("Removal of 55 "+Marks.remove(55));




    }
}
