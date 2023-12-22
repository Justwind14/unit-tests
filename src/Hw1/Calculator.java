package Hw1;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    /**
     * @param purchaseAmount сумма покупки
     * @param discountAmount процент скидки
     * @return возвращает сумму покупки с учетом скидки
     */
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        /*
          осуществляется три проверки:
          1) размер скидки не может быть равен нулю либо меньше нуля
          2) размер суммы покупки не может быть равен нулю или меньше нуля
          3) размер скидки не может быть больше 100%
         */
        if (discountAmount <= 0) {
            throw new ArithmeticException("It is impossible to calculate the discount amount if the amount of discount" +
                    " is less than or equal to 0");
        }
        if (purchaseAmount <= 0) {
            throw new ArithmeticException("It is impossible to calculate the discount amount if the purchase amount" +
                    " is less than or equal to 0");
        }
        if (discountAmount > 100) {
            throw new ArithmeticException("The discount cannot be greater than 100%. We sell, we do not give away items" +
                    " for free.");
        }
        return (purchaseAmount * discountAmount) / 100;
    }
}