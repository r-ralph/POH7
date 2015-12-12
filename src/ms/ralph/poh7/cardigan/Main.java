package ms.ralph.poh7.cardigan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(IntStream.range(1, 1 + Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())).reduce((l, r) -> l * r).getAsInt());
    }
}
