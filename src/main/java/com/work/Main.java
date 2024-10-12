import java.util.Scanner;

package com.work;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите X: ");
        double x = in.nextDouble();

        // Вычисление первой части выражения
        double val1 = Math.sqrt(Math.abs(x));
        double val2 = Math.cos(val1) / (Math.pow(Math.cos(val1), 2) + 5);
        double val3 = Math.pow(Math.acos(val2), 6);

        // Логарифм от второй части
        double val4 = Math.log(4 * Math.pow(Math.atan(4 * x), 4) + 5) / Math.log(2);

        // Окончательное выражение
        double y = 5 * Math.sqrt(val3 + val4);

        // Вывод результата
        System.out.println("Результат y(x) = " + y);

        // Параметры квадрата
        double squareSide = 3;
        double squareCenterX = 0;
        double squareCenterY = 0;

        // Проверка, находится ли точка внутри квадрата
        if ((x > squareCenterX + squareSide / 2) || (x < squareCenterX - squareSide / 2) ||
            (y > squareCenterY + squareSide / 2) || (y < squareCenterY - squareSide / 2)) {
            System.out.println("Точка вне квадрата.");
        } else {
            System.out.println("Точка внутри квадрата.");
        }
    }
}
