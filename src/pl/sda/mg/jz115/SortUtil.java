package pl.sda.mg.jz115;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortUtil {

    public static <T extends Comparable> List<T> reverse(List<T> input) {
        List<T> result = new ArrayList<>(input);
        result.sort(Comparator.reverseOrder());
        return result;
    }


    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "d", "c");
        List<String> resultStrings = reverse(strings);
        System.out.println(resultStrings);

        List<Integer> integers = Arrays.asList(12, 90, 1);
        List<Integer> resultIntegers = reverse(integers);
        System.out.println(resultIntegers);

        List<Pair<String, String>> input = Arrays.asList(new Pair<>("aa", "bb"), new Pair<>("cc", "dd"));
        // niedozwolone poniewaz Pair nie implementuje interfejsu Comparable
//        reverse(input);

        text("a", "b", "c");
    }


    private static void text(String ... args) {
        String result = Stream.of(args)
                .collect(Collectors.joining(", ", "Alfabet to ", "!"));

        System.out.println(result);

    }


    private static void sampleLambda() {
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        //zamieniamy metodę abstrakcyjną na wyrażenie lambda
        Function<String, Integer> function2 = (t) -> Integer.parseInt(t);

    }
}
