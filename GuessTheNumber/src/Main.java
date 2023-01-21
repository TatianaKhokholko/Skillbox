import java.util.Random;
import java.util.Scanner;

/**
 * Напишите программу-игру, в которой пользователь будет угадывать некое число, а программа, если он не угадал,
 * будет сообщать ему, больше или меньше введённое им число, чем загаданное.
 */

public class Main {
    public static void main(String[] args) {
        int hiddenNumber = new Random().nextInt(100);
        System.out.println("Enter integer number from 0 till 100");

        while(true){
            int attempt = new Scanner(System.in).nextInt();
            if(hiddenNumber==attempt){
                System.out.println("You are right!");
                break;
            } else if(attempt>hiddenNumber){
                System.out.println("The hidden number smaller");
            } else{
                System.out.println("The hidden number bigger");
            }
        }
    }
}