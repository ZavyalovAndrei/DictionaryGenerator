import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddToDictionary implements Function {

    @Override
    public Object apply(Object data) {
        String text = (String) data;
        return Arrays
                .stream(text.toLowerCase(Locale.ROOT).split(" "))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }
}