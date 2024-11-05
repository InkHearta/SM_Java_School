package Java2.lesson1;
import java.util.Scanner;

public class Calc1_1 {


    public static void main(String[] args) {
    int number1;
    int number2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи первое число: ");
        number1 = sc.nextInt();
        System.out.println("Введи второе число: ");
        number2 = sc.nextInt();
try {
    System.out.println("ответ: " + number1 / number2);
}
catch (ArithmeticException e){
    System.out.println("на ноль делить нельзя" +e.getMessage());
}
    }
}
