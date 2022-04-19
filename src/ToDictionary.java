import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToDictionary {

    Function<String, List<String>> add = data -> Arrays
            .stream(data.toLowerCase(Locale.ROOT).split(" "))
            .sorted(Comparator.naturalOrder())
            .distinct()
            .collect(Collectors.toList());
}
