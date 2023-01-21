import java.util.Scanner;

/**
 * Напишите программу, которая будет считать факториал переданного в консоли числа.
 * Для проверки кода используйте числа от 1 до 12.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Input integer value:");
        int value = new Scanner(System.in).nextInt();
        int result = 1;

        if (value > 0 && value <= 12) {
            for (int i = 1; i <= value; i++) {
                result *= i;
            }
            System.out.println("!"+value+" = "+result);
        } else {
            System.out.println("Incorrect value!");
        }
    }
}