package ms.ralph.poh7.long_hair;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println((String) new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.collectingAndThen(Collectors.collectingAndThen(Collectors.averagingInt(String::length), Math::round), i -> i == 3 ? "yes" : "no")));
    }
}
