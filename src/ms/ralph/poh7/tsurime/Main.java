package ms.ralph.poh7.tsurime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Stream.of(new BufferedReader(new InputStreamReader(System.in)).readLine()).mapToInt(Integer::parseInt).mapToObj(Object[]::new).flatMap(Arrays::stream).forEach(objects -> System.out.print("Ann"));
    }
}
