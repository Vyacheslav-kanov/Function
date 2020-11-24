import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DictionaryGenerator {//Я использовал детерминированные методы и так как это функции они возвращают значения

    public static List<String> getWordList(String offer) {
        String[] split = offer.split(" ");
        Stream<String> splitList = Arrays.stream(split);
        return splitList
                .collect(Collectors.toList());
    }

    public static List<String> sorter(List<String> notSorted) {
        Stream<String> sortedStream = notSorted.stream();
        return sortedStream
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }

    public String getString(List<String> list) {
        StringBuilder builder = new StringBuilder();
        list.forEach(x -> builder.append(x + "\n"));
        return builder.toString();
    }
}
