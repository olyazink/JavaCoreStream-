import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {

    /*
Task3
    Реализовать функцию нечеткого поиска
    */
    public static void main(String[] args) {
        fuzzySearch("car", "ca6$$#_rtwheel"); // true
        fuzzySearch("cwhl", "cartwheel"); // true
        fuzzySearch("cwhee", "cartwheel"); // true
        fuzzySearch("cartwheel", "cartwheel"); // true
        fuzzySearch("cwheeel", "cartwheel"); // false
        fuzzySearch("lw", "cartwheel"); // false
    }

    private static void fuzzySearch(String isk, String text) {
        boolean res = false;
        List listSmall = Arrays.asList(isk.split(""));
        List listBig = Arrays.asList(text.split(""));

        List differences = new ArrayList<>(listSmall);
        listBig.forEach(differences::remove);
            if (differences.isEmpty()) {
                List temp = new ArrayList<>(listBig);
                temp.retainAll(listSmall);
                if (temp.equals(listSmall)) {
                   res = true;
                }
            }
        System.out.println(res);
    }
}
