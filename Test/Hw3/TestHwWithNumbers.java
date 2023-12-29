package Hw3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestHwWithNumbers {
    HwWithNumbers hwWithNumbers;

    @BeforeEach
    void set_up() {
        hwWithNumbers = new HwWithNumbers();
    }

//    Тест проверяет верность проверки целого числа на четность
    @Test
    void testEvenNumber() {
        assertTrue(hwWithNumbers.evenOddNumber(0));
    }


//    Тест проверяет верность проверки целого числа на нечетность
    @Test
    void testOddNumber() {
        assertFalse(hwWithNumbers.evenOddNumber(-3));
    }


//    Тест проверяет верность утверждения, что число попадает в заданный интервал
    @Test
    void testNumberFallsIntoTheInterval() {
        assertTrue(hwWithNumbers.numberInInterval(29));
    }

//    Тест проверяет верность утверждения, что число не попадает в заданный интервал
    @Test
    void testNumberDoesntFallIntoTheInterval() {
        assertFalse(hwWithNumbers.numberInInterval(-3));
    }

}


