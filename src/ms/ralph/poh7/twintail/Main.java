package ms.ralph.poh7.twintail;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Stream.iterate(new Pair<>(0, new BufferedReader(new InputStreamReader(System.in)).lines().limit(2).map(s -> s.split(" ")).mapToDouble(value -> Double.parseDouble(value[0]) / Integer.parseInt(value[1])).toArray()), p -> new Pair<>(p.getKey() + 1, p.getValue())).limit(2).collect(Collectors.maxBy((a, b) -> Double.compare(a.getValue()[a.getKey()], b.getValue()[b.getKey()]))).get().getKey() + 1);
    }
}
