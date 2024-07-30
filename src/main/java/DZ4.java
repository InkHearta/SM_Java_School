public class DZ4 {


//Напишите метод, который разбивает переданную строку на массив отдельных слов (разделение на строки по символу пробел) и возвращает количество полученных слов (число)
//Напишите метод, который принимает в себя два строковых аргумента - имя и фамилию - и выводит на экран в формате "Внимание! Имя Фамилия героически спасает прода от падения! Вам начислено 2 СМ коина.". Метод НЕ возвращает из себя значение.
//Напишите метод, который не принимает в себя аргументы и возвращает случайное слово из заданного в самом методе массива слов.

    public static String stringForDivide = "раз два три";
    public static String firstName = "Борис";
    public static String secondName = "Мошнин";
    public static void main(String[] args) {
int numberWords = divideString(stringForDivide);
        System.out.println(numberWords);
        whoHeroicQA(firstName, secondName);
        String randomWord = randomWords();
        System.out.println(randomWord);
    }

    public static int divideString(String stringForDivide){
        String[] words = stringForDivide.split(" ");
        return words.length;
    }
    public static void  whoHeroicQA(String firstName, String secondName){
        System.out.println(String.format("Внимание! %s %s героически спасает прода от падения! Вам начислено 2 СМ коина.",firstName, secondName) );
    }
    public static String randomWords(){
String[] randomWords = {"one", "two", "three"};
        int randomNumberWords = (int) (Math.random() * randomWords.length);
        String randomWord = randomWords[randomNumberWords];
        return randomWord;
    }

}
