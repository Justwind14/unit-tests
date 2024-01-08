package Hw6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> list1 = new ArrayList<>();
        list1.add(1.0);
        list1.add(2.0);
        list1.add(3.0);
        List<Double> list2 = new ArrayList<>();
        list2.add(1.0);
        list2.add(2.0);
        list2.add(3.0);
        list2.add(4.0);


        ManipulationOFListOfNumbers lists = new ManipulationOFListOfNumbers(list1, list2);

        System.out.println(lists.getFirstListAverage());
//        lists.averageCalculation();
        lists.AveragesOfListsComparing();
    }
}
