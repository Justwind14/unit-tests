package Hw6;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ManipulationOFListOfNumbersDiffblueTest {
  /**
   * Method under test: {@link ManipulationOFListOfNumbers#averageCalculation()}
   */
  @Test
  void testAverageCalculation() throws Exception {
    // Arrange
    ArrayList<Double> someNumberList1 = new ArrayList<>();
    someNumberList1.add(10.0d);

    ArrayList<Double> someNumberList2 = new ArrayList<>();
    someNumberList2.add(10.0d);
    ManipulationOFListOfNumbers manipulationOFListOfNumbers = new ManipulationOFListOfNumbers(someNumberList1,
            someNumberList2);

    // Act
    manipulationOFListOfNumbers.averageCalculation();

    // Assert
    assertEquals(10.0d, manipulationOFListOfNumbers.getFirstListAverage());
    assertEquals(10.0d, manipulationOFListOfNumbers.getSecondListAverage());
  }

  /**
   * Method under test: {@link ManipulationOFListOfNumbers#averageCalculation()}
   */
  @Test
  void testAverageCalculation2() throws Exception {
    // Arrange
    ArrayList<Double> someNumberList1 = new ArrayList<>();
    someNumberList1.add(10.0d);

    ArrayList<Double> someNumberList2 = new ArrayList<>();
    someNumberList2.add(0.5d);
    someNumberList2.add(10.0d);
    ManipulationOFListOfNumbers manipulationOFListOfNumbers = new ManipulationOFListOfNumbers(someNumberList1,
            someNumberList2);

    // Act
    manipulationOFListOfNumbers.averageCalculation();

    // Assert
    assertEquals(10.0d, manipulationOFListOfNumbers.getFirstListAverage());
    assertEquals(5.25d, manipulationOFListOfNumbers.getSecondListAverage());
  }

  /**
   * Method under test: {@link ManipulationOFListOfNumbers#averageCalculation()}
   */
  @Test
  void testAverageCalculation3() throws Exception {
    // Arrange
    ArrayList<Double> someNumberList1 = new ArrayList<>();
    someNumberList1.add(10.0d);
    someNumberList1.add(10.0d);

    ArrayList<Double> someNumberList2 = new ArrayList<>();
    someNumberList2.add(10.0d);
    ManipulationOFListOfNumbers manipulationOFListOfNumbers = new ManipulationOFListOfNumbers(someNumberList1,
            someNumberList2);

    // Act
    manipulationOFListOfNumbers.averageCalculation();

    // Assert
    assertEquals(10.0d, manipulationOFListOfNumbers.getFirstListAverage());
    assertEquals(10.0d, manipulationOFListOfNumbers.getSecondListAverage());
  }

  /**
   * Method under test: {@link ManipulationOFListOfNumbers#averageCalculation()}
   */
  @Test
  void testAverageCalculation4() throws Exception {
    // Arrange
    ArrayList<Double> someNumberList1 = new ArrayList<>();
    someNumberList1.add(10.0d);

    ArrayList<Double> someNumberList2 = new ArrayList<>();
    someNumberList2.add(10.0d);

    ManipulationOFListOfNumbers manipulationOFListOfNumbers = new ManipulationOFListOfNumbers(someNumberList1,
            someNumberList2);
    manipulationOFListOfNumbers.setFirstDoublesList(new ArrayList<>());

    // Act
    manipulationOFListOfNumbers.averageCalculation();

    // Assert
    assertEquals(10.0d, manipulationOFListOfNumbers.getSecondListAverage());
    assertEquals(Double.NaN, manipulationOFListOfNumbers.getFirstListAverage());
  }

  /**
   * Method under test: {@link ManipulationOFListOfNumbers#averageCalculation()}
   */
  @Test
  void testAverageCalculation5() throws Exception {
    // Arrange
    ArrayList<Double> someNumberList1 = new ArrayList<>();
    someNumberList1.add(10.0d);

    ArrayList<Double> someNumberList2 = new ArrayList<>();
    someNumberList2.add(10.0d);

    ManipulationOFListOfNumbers manipulationOFListOfNumbers = new ManipulationOFListOfNumbers(someNumberList1,
            someNumberList2);
    manipulationOFListOfNumbers.setSecondDoublesList(new ArrayList<>());

    // Act
    manipulationOFListOfNumbers.averageCalculation();

    // Assert
    assertEquals(10.0d, manipulationOFListOfNumbers.getFirstListAverage());
    assertEquals(Double.NaN, manipulationOFListOfNumbers.getSecondListAverage());
  }

  /**
   * Method under test:
   * {@link ManipulationOFListOfNumbers#AveragesOfListsComparing()}
   */
  @Test
  void testAveragesOfListsComparing() throws Exception {
    // Arrange
    ArrayList<Double> someNumberList1 = new ArrayList<>();
    someNumberList1.add(10.0d);

    ArrayList<Double> someNumberList2 = new ArrayList<>();
    someNumberList2.add(10.0d);
    ManipulationOFListOfNumbers manipulationOFListOfNumbers = new ManipulationOFListOfNumbers(someNumberList1,
            someNumberList2);

    // Act
    manipulationOFListOfNumbers.AveragesOfListsComparing();

    // Assert that nothing has changed
    assertEquals(0.0d, manipulationOFListOfNumbers.getFirstListAverage());
    assertEquals(0.0d, manipulationOFListOfNumbers.getSecondListAverage());
    List<Double> firstDoublesList = manipulationOFListOfNumbers.getFirstDoublesList();
    assertEquals(1, firstDoublesList.size());
    assertEquals(firstDoublesList, manipulationOFListOfNumbers.getSecondDoublesList());
  }

  /**
   * Method under test:
   * {@link ManipulationOFListOfNumbers#AveragesOfListsComparing()}
   */
  @Test
  void testAveragesOfListsComparing2() throws Exception {
    // Arrange
    ArrayList<Double> someNumberList1 = new ArrayList<>();
    someNumberList1.add(10.0d);

    ArrayList<Double> someNumberList2 = new ArrayList<>();
    someNumberList2.add(10.0d);

    ManipulationOFListOfNumbers manipulationOFListOfNumbers = new ManipulationOFListOfNumbers(someNumberList1,
            someNumberList2);
    manipulationOFListOfNumbers.setFirstListAverage(10.0d);

    // Act
    manipulationOFListOfNumbers.AveragesOfListsComparing();

    // Assert that nothing has changed
    assertEquals(0.0d, manipulationOFListOfNumbers.getSecondListAverage());
    List<Double> firstDoublesList = manipulationOFListOfNumbers.getFirstDoublesList();
    assertEquals(1, firstDoublesList.size());
    assertEquals(10.0d, manipulationOFListOfNumbers.getFirstListAverage());
    assertEquals(firstDoublesList, manipulationOFListOfNumbers.getSecondDoublesList());
  }

  /**
   * Method under test:
   * {@link ManipulationOFListOfNumbers#AveragesOfListsComparing()}
   */
  @Test
  void testAveragesOfListsComparing3() throws Exception {
    // Arrange
    ArrayList<Double> someNumberList1 = new ArrayList<>();
    someNumberList1.add(10.0d);

    ArrayList<Double> someNumberList2 = new ArrayList<>();
    someNumberList2.add(10.0d);

    ManipulationOFListOfNumbers manipulationOFListOfNumbers = new ManipulationOFListOfNumbers(someNumberList1,
            someNumberList2);
    manipulationOFListOfNumbers.setSecondListAverage(10.0d);

    // Act
    manipulationOFListOfNumbers.AveragesOfListsComparing();

    // Assert that nothing has changed
    assertEquals(0.0d, manipulationOFListOfNumbers.getFirstListAverage());
    List<Double> firstDoublesList = manipulationOFListOfNumbers.getFirstDoublesList();
    assertEquals(1, firstDoublesList.size());
    assertEquals(10.0d, manipulationOFListOfNumbers.getSecondListAverage());
    assertEquals(firstDoublesList, manipulationOFListOfNumbers.getSecondDoublesList());
  }

  /**
   * Method under test:
   * {@link ManipulationOFListOfNumbers#AveragesOfListsComparing()}
   */
  @Test
  void testAveragesOfListsComparing4() throws Exception {
    // Arrange
    ArrayList<Double> someNumberList1 = new ArrayList<>();
    someNumberList1.add(10.0d);

    ArrayList<Double> someNumberList2 = new ArrayList<>();
    someNumberList2.add(10.0d);

    ManipulationOFListOfNumbers manipulationOFListOfNumbers = new ManipulationOFListOfNumbers(someNumberList1,
            someNumberList2);
    manipulationOFListOfNumbers.setSecondListAverage(10.0d);
    manipulationOFListOfNumbers.setFirstListAverage(10.0d);

    // Act
    manipulationOFListOfNumbers.AveragesOfListsComparing();

    // Assert that nothing has changed
    List<Double> firstDoublesList = manipulationOFListOfNumbers.getFirstDoublesList();
    assertEquals(1, firstDoublesList.size());
    assertEquals(10.0d, manipulationOFListOfNumbers.getFirstListAverage());
    assertEquals(10.0d, manipulationOFListOfNumbers.getSecondListAverage());
    assertEquals(firstDoublesList, manipulationOFListOfNumbers.getSecondDoublesList());
  }

  /**
   * Methods under test:
   *
   * <ul>
   *   <li>{@link ManipulationOFListOfNumbers#setFirstDoublesList(List)}
   *   <li>{@link ManipulationOFListOfNumbers#setFirstListAverage(double)}
   *   <li>{@link ManipulationOFListOfNumbers#setSecondDoublesList(List)}
   *   <li>{@link ManipulationOFListOfNumbers#setSecondListAverage(double)}
   *   <li>{@link ManipulationOFListOfNumbers#getFirstDoublesList()}
   *   <li>{@link ManipulationOFListOfNumbers#getFirstListAverage()}
   *   <li>{@link ManipulationOFListOfNumbers#getSecondDoublesList()}
   *   <li>{@link ManipulationOFListOfNumbers#getSecondListAverage()}
   * </ul>
   */
  @Test
  @Disabled("TODO: Complete this test")
  void testGettersAndSetters() {
    // TODO: Complete this test.
    //   Reason: R081 Exception in arrange section.
    //   Diffblue Cover was unable to construct an instance of the class under test using
    //   Hw6.ManipulationOFListOfNumbers.setFirstDoublesList(List).
    //   The arrange section threw
    //   java.lang.Exception: список/списки не могут быть пустыми
    //       at Hw6.ManipulationOFListOfNumbers.<init>(ManipulationOFListOfNumbers.java:12)
    //   See https://diff.blue/R081 to resolve this issue.

    // Arrange
    // TODO: Populate arranged inputs
    ManipulationOFListOfNumbers manipulationOFListOfNumbers = null;
    List<Double> firstDoublesList = null;

    // Act
    manipulationOFListOfNumbers.setFirstDoublesList(firstDoublesList);
    double firstListAverage = 0.0d;
    manipulationOFListOfNumbers.setFirstListAverage(firstListAverage);
    List<Double> secondDoublesList = null;
    manipulationOFListOfNumbers.setSecondDoublesList(secondDoublesList);
    double secondListAverage = 0.0d;
    manipulationOFListOfNumbers.setSecondListAverage(secondListAverage);
    List<Double> actualFirstDoublesList = manipulationOFListOfNumbers.getFirstDoublesList();
    double actualFirstListAverage = manipulationOFListOfNumbers.getFirstListAverage();
    List<Double> actualSecondDoublesList = manipulationOFListOfNumbers.getSecondDoublesList();
    double actualSecondListAverage = manipulationOFListOfNumbers.getSecondListAverage();

    // Assert
    // TODO: Add assertions on result
  }

  /**
   * Method under test:
   * {@link ManipulationOFListOfNumbers#ManipulationOFListOfNumbers(List, List)}
   */
  @Test
  void testNewManipulationOFListOfNumbers() throws Exception {
    // Arrange
    ArrayList<Double> someNumberList1 = new ArrayList<>();

    // Act and Assert
    assertThrows(Exception.class, () -> new ManipulationOFListOfNumbers(someNumberList1, new ArrayList<>()));

  }

  /**
   * Method under test:
   * {@link ManipulationOFListOfNumbers#ManipulationOFListOfNumbers(List, List)}
   */
  @Test
  void testNewManipulationOFListOfNumbers2() throws Exception {
    // Arrange
    ArrayList<Double> someNumberList1 = new ArrayList<>();
    someNumberList1.add(10.0d);

    // Act and Assert
    assertThrows(Exception.class, () -> new ManipulationOFListOfNumbers(someNumberList1, new ArrayList<>()));

  }

  /**
   * Method under test:
   * {@link ManipulationOFListOfNumbers#ManipulationOFListOfNumbers(List, List)}
   */
  @Test
  void testNewManipulationOFListOfNumbers3() throws Exception {
    // Arrange
    ArrayList<Double> someNumberList1 = new ArrayList<>();
    someNumberList1.add(0.5d);
    someNumberList1.add(10.0d);

    // Act and Assert
    assertThrows(Exception.class, () -> new ManipulationOFListOfNumbers(someNumberList1, new ArrayList<>()));

  }

  /**
   * Method under test:
   * {@link ManipulationOFListOfNumbers#ManipulationOFListOfNumbers(List, List)}
   */
  @Test
  void testNewManipulationOFListOfNumbers4() throws Exception {
    // Arrange
    ArrayList<Double> someNumberList1 = new ArrayList<>();

    ArrayList<Double> someNumberList2 = new ArrayList<>();
    someNumberList2.add(10.0d);

    // Act and Assert
    assertThrows(Exception.class, () -> new ManipulationOFListOfNumbers(someNumberList1, someNumberList2));

  }

  /**
   * Method under test:
   * {@link ManipulationOFListOfNumbers#ManipulationOFListOfNumbers(List, List)}
   */
  @Test
  void testNewManipulationOFListOfNumbers5() throws Exception {
    // Arrange
    ArrayList<Double> someNumberList1 = new ArrayList<>();

    ArrayList<Double> someNumberList2 = new ArrayList<>();
    someNumberList2.add(0.5d);
    someNumberList2.add(10.0d);

    // Act and Assert
    assertThrows(Exception.class, () -> new ManipulationOFListOfNumbers(someNumberList1, someNumberList2));

  }

  /**
   * Method under test:
   * {@link ManipulationOFListOfNumbers#ManipulationOFListOfNumbers(List, List)}
   */
  @Test
  void testNewManipulationOFListOfNumbers6() throws Exception {
    // Arrange
    ArrayList<Double> someNumberList1 = new ArrayList<>();
    someNumberList1.add(10.0d);

    ArrayList<Double> someNumberList2 = new ArrayList<>();
    someNumberList2.add(10.0d);

    // Act
    ManipulationOFListOfNumbers actualManipulationOFListOfNumbers = new ManipulationOFListOfNumbers(someNumberList1,
            someNumberList2);

    // Assert
    List<Double> firstDoublesList = actualManipulationOFListOfNumbers.getFirstDoublesList();
    assertEquals(1, firstDoublesList.size());
    assertEquals(firstDoublesList, actualManipulationOFListOfNumbers.getSecondDoublesList());
  }
}
