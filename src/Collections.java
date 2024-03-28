import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collections {
    static Collection<String> names = new ArrayList<>();

    static void addCollection() {
        System.out.println("Add Collection");

        names.add("ryo");
        names.add("yo");
        names.addAll(Arrays.asList("Khai", "salam"));

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    static void removeCollection() {
        System.out.println("Remove Collection");

        names.add("ryo");
        names.add("yo");
        names.addAll(Arrays.asList("Khai", "salam"));

        names.remove("ryo");
        names.removeAll(Arrays.asList("Khai", "salam"));

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    static void checkCollection() {
        System.out.println("Check Collection");

        names.add("Khai");
        names.add("yo");
        names.addAll(Arrays.asList("Khai", "salam"));

        System.out.println(names.contains("Khai"));
        System.out.println(names.containsAll(Arrays.asList("Khai", "salam")));

        names.remove("Khai");
        names.removeAll(Arrays.asList("Khai", "salam"));

        System.out.println(names.contains("ryo"));
        System.out.println(names.containsAll(Arrays.asList("Khai", "salam")));

        System.out.println();
    }
}