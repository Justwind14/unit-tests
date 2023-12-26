import Hw2.Car;
import Hw2.Motorcycle;
import Hw2.Vehicle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/*Проект Vehicle. Написать следующие тесты с использованием JUnit5:

        - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).

        - Проверить, что объект Car создается с 4-мя колесами.

        - Проверить, что объект Motorcycle создается с 2-мя колесами.

        - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).

        - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).

        - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).

        - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).*/


public class VehicleTest {
    static Car car;
    static Motorcycle moto;

    @BeforeAll
    public static void init() {
        car = new Car("Lada", "Dance", 1966);
        moto = new Motorcycle("Ural", "SPORTSMAN", 2022);
    }

//    - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    void testCarIsInstanceOfVehicle() {
        assertInstanceOf(Vehicle.class, car);
    }

//    - Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void testCarWheelsCount() {
        assertEquals(4, car.getNumWheels());
    }

//    - Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void testMotorcycleWheelsCount() {
        assertEquals(2, moto.getNumWheels());
    }

//    - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void testCarSpeed() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

//    - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void testMotorcycleSpeed() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

//    - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    void testCarisStoppedWhenPark() {
        car.testDrive();
        assertTrue(car.getSpeed() > 0);
        car.park();
        assertEquals(0, car.getSpeed());
    }

//    - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    void testMotorcycleIsStoppedWhenPark() {
        moto.testDrive();
        assertTrue(moto.getSpeed() > 0);
        moto.park();
        assertEquals(0, moto.getSpeed());
    }
}
