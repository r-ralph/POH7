package ms.ralph.poh7.ponytail;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(IntStream.rangeClosed(1, Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())).collect(StringBuilder::new, (s, t) -> s.append("\n").append(new StringBuilder().append(t).reverse().toString()), StringBuilder::append).reverse().append("0!!").toString());
    }
}
