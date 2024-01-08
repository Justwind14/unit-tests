package Hw6;

import java.util.List;

public class ManipulationOFListOfNumbers {
    private double firstListAverage;
    private double secondListAverage;
    private List<Double> firstDoublesList;
    private List<Double> secondDoublesList;
    public ManipulationOFListOfNumbers (List<Double> someNumberList1, List<Double> someNumberList2) {
        this.firstDoublesList = someNumberList1;
        this.secondDoublesList = someNumberList2;
    }

    public void averageCalculation() {
        this.firstListAverage = (this.firstDoublesList.stream().mapToDouble(i -> i).sum()) / this.firstDoublesList.size();
        this.secondListAverage = (this.secondDoublesList.stream().mapToDouble(i -> i).sum()) / this.secondDoublesList.size();
    }

    public void AveragesOfListsComparing() {
        if (this.getFirstListAverage() != 0 && this.getSecondListAverage() != 0) {
            if (this.firstListAverage > this.secondListAverage) {
                System.out.println("Первый список имеет большее среднее значение");
            }
            if (this.firstListAverage < this.secondListAverage) {
                System.out.println("Второй список имеет большее среднее значение");
            }
            if (this.firstListAverage == this.secondListAverage) {
                System.out.println("Средние значения равны");
            }
        }
        else System.out.println("Небходимо сначала вычислить средние значения списков");
    }

    public double getFirstListAverage() {
        return firstListAverage;
    }

    public void setFirstListAverage(double firstListAverage) {
        this.firstListAverage = firstListAverage;
    }

    public double getSecondListAverage() {
        return secondListAverage;
    }

    public void setSecondListAverage(double secondListAverage) {
        this.secondListAverage = secondListAverage;
    }

    public List<Double> getFirstDoublesList() {
        return firstDoublesList;
    }

    public void setFirstDoublesList(List<Double> firstDoublesList) {
        this.firstDoublesList = firstDoublesList;
    }

    public List<Double> getSecondDoublesList() {
        return secondDoublesList;
    }

    public void setSecondDoublesList(List<Double> secondDoublesList) {
        this.secondDoublesList = secondDoublesList;
    }
}
