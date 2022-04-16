package lab_2;
import java.util.Random;
import java.util.Scanner;
public class GameFindNumber {

    public static void main(String[] args) {
        int prob = 1;
        int ost_prob;
        int compNumber = random();
        boolean profit = false;
        System.out.println("комп загадал=" + compNumber);
        int humNumber = 0;
        while ((prob <= 3)& (profit==false)) {
            humNumber = scan();

            if ((humNumber == compNumber) & (prob <= 3) & (profit==false)) {
                System.out.println("Попытка №=" + prob );  //+ " Вы выиграли"
                profit = true;
            } else {
                ost_prob = 3 - prob;
                System.out.println("Попытка №=" + prob + "Увы, у вас есть еще " + ost_prob + " попытки");
            }
            prob++;
        }
        prob--;
        if (humNumber == compNumber & prob <= 3) {
            System.out.println(" Вы выиграли"); //"Попытка №=" + prob +
        } else {
            System.out.println("Попытка №=" + prob + "Увы");
        }
    }

    public static int random() {
        Random newRandom = new Random();
        int randoNumber = newRandom.nextInt(11);
        return randoNumber;
    }

    public static int scan(){
        System.out.println("Введите число от 1 до 10");
        Scanner scanner = new Scanner(System.in);
        int humanNumber = scanner.nextInt();
        return humanNumber;
    }
}





