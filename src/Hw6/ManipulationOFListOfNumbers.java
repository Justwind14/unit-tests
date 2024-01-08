package Hw6;

import java.util.List;
/**
 * Это класс ManipulationOFListOfNumbers.
 *@author Mikhail Donets
 */

public class ManipulationOFListOfNumbers {
    /**
     * это поле содержит первый список чисел
     */
    private List<Double> firstDoublesList;
    /**
     * это поле содержит второй список чисел
     */
    private List<Double> secondDoublesList;
    /**
       * это поле содержит среднее значение первого списка чисел
     */
    private double firstListAverage;
    /**
     * это поле содержит среднее значение второго списка чисел
     */
    private double secondListAverage;

    /**
     * Конструктор
     * @param someNumberList1 - первый список чисел
     * @param someNumberList2 - второй список чисел
     */

    public ManipulationOFListOfNumbers (List<Double> someNumberList1, List<Double> someNumberList2) throws Exception {
        // проверяем принимаемые в конструктор списки на пустоту
        if (someNumberList1.isEmpty() || someNumberList2.isEmpty() || someNumberList1 == null || someNumberList2 == null) {
            throw new Exception("список/списки не могут быть пустыми");
        }
        this.firstDoublesList = someNumberList1;
        this.secondDoublesList = someNumberList2;
    }


    /**
     * Метод averageCalculation рассчитывает средние значения у каждого списка в экземпляре класса
     */

    public void averageCalculation() {
        this.firstListAverage = (this.firstDoublesList.stream().mapToDouble(i -> i).sum()) / this.firstDoublesList.size();
        this.secondListAverage = (this.secondDoublesList.stream().mapToDouble(i -> i).sum()) / this.secondDoublesList.size();
    }


    /**
     * Метод averagesOfListsComparing сравнивает средние значения у списков и выводит в консоль результаты сравнения
     */

    public String averagesOfListsComparing() {
        if (this.firstListAverage <= 0 || this.secondListAverage <= 0)
            return "Небходимо сначала вычислить средние значения списков";
        if (this.firstListAverage > this.secondListAverage) {
            return "Первый список имеет большее среднее значение";
        }
        if (this.firstListAverage < this.secondListAverage) {
            return "Второй список имеет большее среднее значение";
        }
        if (this.firstListAverage == this.secondListAverage) {
            return "Средние значения равны";
        }
        return null;
    }

    /**
     * Геттеры сеттеры всех полей класса
     */

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
