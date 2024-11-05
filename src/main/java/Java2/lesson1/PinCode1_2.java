package Java2.lesson1;
import java.util.Scanner;

public class PinCode1_2
{
    public static void main(String[] args) {
        int number;
        String[] pinCods = {"123", "222", "3333", "5555"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи порядковый номер пинкода: ");
        number = sc.nextInt();
        try {
            System.out.println("твой пинкод: " + pinCods[number]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Превышен размер массива");
        }
    }
}
