package ms.ralph.poh7.short_hair;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().mapToInt(Integer::parseInt).sum());
    }
}
