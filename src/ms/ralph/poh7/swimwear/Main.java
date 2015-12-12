package ms.ralph.poh7.swimwear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
                DoubleStream.of(
                        LongStream.rangeClosed(1, Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()))
                                .mapToObj(String::valueOf)
                                .map(s -> s.replaceFirst("0+$", ""))
                                .map(s -> s.length() > 9 ? s.substring(s.length() - 9) : s)
                                .mapToDouble(Double::parseDouble)
                                .reduce((left, right) -> DoubleStream.of(left * right)
                                        .mapToObj(value -> BigDecimal.valueOf(value).toPlainString())
                                        .map(s -> s.split("\\.")[0])
                                        .map(s -> s.replaceFirst("0+$", ""))
                                        .map(s -> s.length() > 11 ? s.substring(s.length() - 11) : s)
                                        .mapToLong(Long::parseLong)
                                        .findFirst().getAsLong())
                                .getAsDouble())
                        .mapToObj(value -> BigDecimal.valueOf(value).toPlainString())
                        .map(s -> s.split("\\.")[0])
                        .map(s -> s.length() > 9 ? s.substring(s.length() - 9) : s)
                        .mapToLong(Long::valueOf)
                        .mapToObj(String::valueOf)
                        .findFirst().get()
        );
    }
}