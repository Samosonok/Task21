import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Task1 {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> squareValues = stream
                .filter(number -> number % 2 == 0)
                .map(value -> value * value)
                .collect(Collectors.toList());
        System.out.println(squareValues);
    }
}
