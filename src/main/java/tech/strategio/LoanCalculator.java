package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * Function receives a number and outputs loan remainder after removing 10 % each month.
     *
     * 
     * @param amount initial amount (int)
     * @return amount remaining loan amount
     */


    static int getRemainingAmountIn3Months(int amount) {
        for (int i = 0; i < 3; i++) {
            int remainder;
            remainder = (int)(amount * 0.1);
            amount -= remainder;
        }
        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
