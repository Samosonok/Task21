import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Task2 {

    public static void main(String[] args) {

        List<String> catsNames = new ArrayList<>();
        Collections.addAll(catsNames,
                "Barsic", "murzik", "anfisa", "Barney", "Murka");

        // predicate
        Predicate<List<String>> isMoreThanTwoLines = (list) -> {
            list.removeIf(f -> Character.isLowerCase(f.charAt(0)));
            return list.size() > 2;
        };
        System.out.println(isMoreThanTwoLines.test(catsNames));

        // stream
        boolean result = catsNames.stream()
                .map(catName -> catName.charAt(0))
                .filter(Character::isUpperCase)
                .count() > 2;
        System.out.println(result);
    }
}
