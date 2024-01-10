package Hw6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        ManipulationOFListOfNumbers lists = new ManipulationOFListOfNumbers(Arrays.asList(1.0, 2.0), Arrays.asList(1.0, 2.0));
        lists.setFirstDoublesList(Arrays.asList(1.0, 2.0, 3.0));
        System.out.println(lists.getFirstDoublesList().size());
    }
}
