import java.util.Scanner;

/**
 * Напишите программу, которая будет находить все пары положительных целых чисел,
 * произведение которых будет равно значению value.
 * Например, если ввести число 6, программа должна выдать следующий результат:
 * 1*6
 * 2*3
 * 3*2
 * 6*1
 */

public class Main {
    public static void main(String[] args){
        System.out.println("Input integer value:");
        int value = new Scanner(System.in).nextInt();

        System.out.println("Result:");
        for(int i = 0; i <= value; i++) {
            for (int y = 0; y <= value; y++) {
                if(i * y == value) {
                    System.out.println(i + "*" + y);
                }
            }
        }
    }
}
