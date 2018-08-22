package task0140;

import java.util.Scanner;
/* 
Выводим квадрат числа
Напиши программу, которая считывает с клавиатуры целое число a и выводит квадрат этого числа (a * a).
Для считывания данных с клавиатуры используй метод nextInt() класса Scanner.

Требования:
1. Программа должна выводить текст.
2. В программе необходимо создать объект типа Scanner.
3. Программа должна считывать данные с клавиатуры.
4. Программа должна выводить только значение квадрата считанного числа.
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            a = (int)Math.pow(scanner.nextInt(), 2);
        }
        System.out.println(a);
    }
}