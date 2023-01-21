/**
 * Напишите программу с использованием цикла while, которая рассчитает и выведет в консоль время наполнения бассейна
 * с учётом скоростей наполнения и опустошения.
 */

public class Main {
    public static void main(String[] args){
        int volume = 1200;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int currentValue = 0;
        int time = 0;

        while(currentValue <= volume){
            time++;
            currentValue+=fillingSpeed-devastationSpeed;
            if(currentValue==volume){
                break;
            }
        }
        System.out.println("The swimming pool fill up with " + time + " minutes");
    }
}

