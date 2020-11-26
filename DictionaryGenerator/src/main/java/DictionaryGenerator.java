import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DictionaryGenerator {//Я использовал детерминированные методы и так как это функции они возвращают значения

    public static List<String> getWordList(String text) {
        Stream<String> toList = Arrays.stream(text.split(" "));
        return toList
                .collect(Collectors.toList());
    }

    public static List<String> sorter(List<String> list) {
        Stream<String> shuffle = list.stream();
        return shuffle
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }

    public String getString(List<String> list) {
        StringBuilder builder = new StringBuilder();
        list.forEach(x -> builder.append(x + "\n"));
        return builder.toString();
    }
}
