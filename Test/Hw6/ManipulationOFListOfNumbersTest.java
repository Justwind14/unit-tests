package Hw6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ManipulationOFListOfNumbersTest {

  List<Double> someNumberList1;

  List<Double> someNumberList2;

  ManipulationOFListOfNumbers lists;

  @BeforeEach
  /**
   * задаем входные данные всем тестам
   */
  void setUp() throws Exception {
    someNumberList1 = new ArrayList<>();
    someNumberList1.add(10.0d);
    someNumberList1.add(20.0d);
    someNumberList1.add(30.0d);

    someNumberList2 = new ArrayList<>();
    someNumberList2.add(10.0d);
    someNumberList2.add(20.0d);
    someNumberList2.add(30.0d);

    lists = new ManipulationOFListOfNumbers(someNumberList1, someNumberList2);
  }

  /**
   * ----------------------- МОДУЛЬНОЕ ТЕСТИРОВАНИЕ ------------------------------
   */

  /**
   * Method under test: {@link ManipulationOFListOfNumbers#averageCalculation()}
   * проверяем вычисление размера первого листа
   */
  @Test
  void testAverageCalculation3() throws Exception {
    // Assert
    assertEquals(3, lists.getFirstDoublesList().size());
  }

  /**
   * Method under test:
   * {@link ManipulationOFListOfNumbers#ManipulationOFListOfNumbers(List, List)}
   * проверяем, что при создании экземпляра класса с пустым листом первым
   * аргументом будет вызываться ошибка
   */
  @Test
  void testNewManipulationOFListOfNumbers() throws Exception {
    // Arrange
    ArrayList<Double> someList1 = new ArrayList<>();

    // Act and Assert
    assertThrows(Exception.class, () -> new ManipulationOFListOfNumbers(someList1, someNumberList2));
  }

  /**
   * Method under test:
   * {@link ManipulationOFListOfNumbers#ManipulationOFListOfNumbers(List, List)}
   * проверяем, что при создании экземпляра класса с пустым листом вторым
   * аргументом будет вызываться ошибка
   */
  @Test
  void testNewManipulationOFListOfNumbers2() throws Exception {
    // Arrange
    ArrayList<Double> someList2 = new ArrayList<>();

    // Act and Assert
    assertThrows(Exception.class, () -> new ManipulationOFListOfNumbers(someNumberList1, someList2));
  }

  /**
   * Method under test: {@link ManipulationOFListOfNumbers#averageCalculation()}
   * проверяем вычисление размера второго листа
   */
  @Test
  void testAverageCalculation4() throws Exception {
    // Act

    // Assert
    assertEquals(3, lists.getSecondDoublesList().size());
  }

  /**
   * ----------- ИНТЕГРАЦИОННОЕ ТЕСТИРОВАНИЕ ----------------------
   */

  /**
   * Method under test: {@link ManipulationOFListOfNumbers#averageCalculation()}
   * проверяем правильность расчета среднего значения у первого листа
   */
  @Test
  void testAverageCalculation() throws Exception {
    // Act
    lists.averageCalculation();

    // Assert
    assertEquals(20.0d, lists.getFirstListAverage());
  }

  /**
   * Method under test: {@link ManipulationOFListOfNumbers#averageCalculation()}
   * проверяем правильность расчета среднего значения у второго листа
   */
  @Test
  void testAverageCalculation2() throws Exception {
    // Act
    lists.averageCalculation();

    // Assert
    assertEquals(20.0d, lists.getSecondListAverage());
  }

  /**
   * Method under test:
   * {@link ManipulationOFListOfNumbers#averagesOfListsComparing()}
   */
  @Test
  void testAveragesOfListsComparing4() throws Exception {
    // Arrange
    lists.setFirstListAverage(0);
    lists.setSecondListAverage(0);

    // Act and Assert
    assertEquals("Небходимо сначала вычислить средние значения списков", lists.averagesOfListsComparing());
  }

  /**
   * -------------- E2E ТЕСТЫ ---------------------------
   */

  /**
   * Method under test:
   * {@link ManipulationOFListOfNumbers#averagesOfListsComparing()} проверяем на
   * условие, что среднее значение второго листа больше первого
   */
  @Test
  void testAveragesOfListsComparing3() throws Exception {
    // Arrange
    List<Double> list3 = new ArrayList<>();
    list3.add(10.0d);
    list3.add(20.0d);
    list3.add(30.0d);
    list3.add(40.0d);

    ManipulationOFListOfNumbers lists2 = new ManipulationOFListOfNumbers(someNumberList1, list3);
    lists2.averageCalculation();

    // Act and Assert
    assertEquals("Второй список имеет большее среднее значение", lists2.averagesOfListsComparing());
  }

  /**
   * Method under test:
   * {@link ManipulationOFListOfNumbers#averagesOfListsComparing()} проверяем на
   * условие, что среднее значение первого листа больше второго
   */
  @Test
  void testAveragesOfListsComparing2() throws Exception {
    // Arrange
    List<Double> list3 = new ArrayList<>();
    list3.add(10.0d);
    list3.add(20.0d);
    list3.add(30.0d);
    list3.add(40.0d);

    ManipulationOFListOfNumbers lists3 = new ManipulationOFListOfNumbers(list3, someNumberList2);
    lists3.averageCalculation();
    // Act and Assert
    assertEquals("Первый список имеет большее среднее значение", lists3.averagesOfListsComparing());
  }

  /**
   * Method under test:
   * {@link ManipulationOFListOfNumbers#averagesOfListsComparing()} проверяем на
   * равенство значений
   */
  @Test
  void testAveragesOfListsComparing() throws Exception {
    // Act
    lists.averageCalculation();

    // Act and Assert
    assertEquals("Средние значения равны", lists.averagesOfListsComparing());
  }


}
