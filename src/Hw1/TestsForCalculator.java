package Hw1;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TestsForCalculator {
    public static void main(String[] args) {

//        если хотим что утверждение вызвало ошибку, то нужно раскомментировать этот код:
//        checkRightDiscountCalculation(2500.00, 6);

//        вызываем метод проверки утверждения на правильный рассчет скидки
        checkRightDiscountCalculation(2500.00, 5);

//        вызываем метод проверки выброса ArithmeticException
        checkExceptionCatching(2500.00, 0);

    }

    /**
     * метод checkRightDiscountCalculation() проверяет отработку утверждений на правильный рассчет скидки
     * @param purchaseAmount сумма покупки
     * @param discountAmount процент скидки
     */
    public static void checkRightDiscountCalculation(double purchaseAmount, int discountAmount) {
        assertThat(Calculator.calculatingDiscount(purchaseAmount, discountAmount)).isEqualTo(125.00);
    }

    /**
     * метод checkExceptionCatching() проверяет, будет ли выбрасываться ошибка класса ArithmeticException
     * при неправильно введенных данных. Если ошибка будет выбрасываться, то вызов данного метода отработает без ошибок
     * @param purchaseAmount сумма покупки
     * @param discountAmount процент скидки
     */
    public static void checkExceptionCatching(double purchaseAmount, int discountAmount) {
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(purchaseAmount, discountAmount)
        ).isInstanceOf(ArithmeticException.class);
    }
}