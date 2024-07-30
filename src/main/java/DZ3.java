import java.util.Arrays;
import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
        String[] gameCarts = {"6", "7","8", "9", "10", "В", "Д","К","Т"};
        int randomNumberPile = (int) (Math.random() * gameCarts.length);
       String randomCart = gameCarts[randomNumberPile];
        System.out.println(String.format("необходимо угадать загаданную карту:  %s", Arrays.toString(gameCarts)));

        String userInput = null;
        int count = 0;
        while(!(randomCart.equalsIgnoreCase(userInput)))
        {
            count++;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введи: ");
            userInput = sc.nextLine();
            if(randomCart.equalsIgnoreCase(userInput)){
                System.out.println("Угадал, за:" + count + " попыток");
            }
            else if(userInput.equalsIgnoreCase("Выход"))
            {
             break;
            }
            else {System.out.println("Не угадал, попробуй еще раз. Или набери слово 'Выход' чтобы выйти ");
            }

        }
    }
}
