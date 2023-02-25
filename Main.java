import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Algorithm algorithm = new Algorithm();
        algorithm.myAlgorithm();

    }
}
class Algorithm {

    Scanner word = new Scanner(System.in);
    Random in = new Random();

    private String[] mass = {"яблоко", "апельсин", "банан", "манго", "киви"};
    private String myFruit;
    private int secretFruit;


    public void myAlgorithm() {

        do {
            System.out.println("Какой фрукт я загадал: яблоко, апельсин, банан, манго или киви?\nЕсли хотите уйти напишите \"Нет\". :-(");
            secretFruit = in.nextInt(5);
            myFruit = word.nextLine();
            if (myFruit.equals(mass[secretFruit])) {
                System.out.println("Превосходно! Вы угадали! Это " + mass[secretFruit]);
            } else if (myFruit.equals("нет") || myFruit.equals("Нет")) {
                System.out.println("Рады были с Вами поиграть, до новой встречи! :-)");
                break;
            } else {
                System.out.println("Не угадали! Это был " + mass[secretFruit] + " Попробуйте еще раз! :-)");
            }
        } while (true);
    }
}

