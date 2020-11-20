import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DictionaryGenerator {

    private String offer;

    public DictionaryGenerator() {
    }

    private static FunctionDictionaryGenerator dictionary(String offer){
        List<String> dictionary = new ArrayList<>();
        FunctionDictionaryGenerator funcDG = (a) -> {

        String[] split = offer.split(" ");

        for (int i = 0; i < split.length; i++) {
            dictionary.add(split[i] + "\n");
        }

        dictionary.sort(String::compareTo);
            return dictionary;
        };
        return funcDG;
    }

    public String writeDictionary(String offer){
        StringBuilder builder = new StringBuilder();
        dictionary(offer).dictionaryGenerator(offer).forEach(x -> builder.append(x));

        return builder.toString();
    }


}
