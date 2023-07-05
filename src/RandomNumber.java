import java.util.Random;


public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100);
        System.out.print("Загаданное число: " + randomNum + "\n");
        for (int guessesMade = 5; guessesMade < 100; guessesMade++) {
            if (randomNum < guessesMade) {
                System.out.println("Число " + guessesMade + " больше того, что загадал компьютер");
            } else if (randomNum > guessesMade) {
                System.out.println("Число " + guessesMade + " меньше того, что загадал компьютер");
            } else
                break;
        }
        System.out.println("Вы победили! Число " + randomNum);
    }
}
