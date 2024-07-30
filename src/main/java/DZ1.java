public class DZ1 {
    public static void main(String[] args) {
       /* - задает две целочисленные переменные (длина и ширина прямоугольника) - с какими вам угодно значениями
рассчитывает площадь прямоугольника на базе этих переменных и сохраняет полученное значение площади в переменную
красиво выводит в консоль заданную длину и ширину, а так же полученный результат, в духе
Площадь прямоугольника с шириной '4' и длиной '5' равна '20'*/

        int lengthRectangle = 4;
        int widthRectangle =  5;
        int squareRectangle = lengthRectangle*widthRectangle;
        System.out.println("Площадь прямоугольника с шириной '" + widthRectangle + "' и длиной '" + lengthRectangle + "' равна '" + squareRectangle + "'");
    }
}
