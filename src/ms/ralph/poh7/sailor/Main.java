package ms.ralph.poh7.sailor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().skip(1).collect(Collectors.joining("_")));
    }
}
