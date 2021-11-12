import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Task3 {

    public static void main(String[] args) {
        Map<Integer, Boolean> map = new HashMap<>();
        map.put(1, true);
        map.put(65, false);
        map.put(7, true);
        map.put(9, true);
        map.put(34, false);
        map.put(86, false);
        map.put(2, true);
        map.put(75, false);

        List<Integer> trueValues = map.entrySet().stream()
                .filter(Map.Entry::getValue)
                .map(Map.Entry::getKey)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(trueValues);
    }
}
