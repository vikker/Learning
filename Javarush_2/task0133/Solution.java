package task0133;

/* 
Не думать о секундах…
После 12:00 прошло secondsAfter12 секунд. Напиши код который считает сколько секунд прошло после 15:00.

Пример:
Метод getSecondsAfter15 вызывается с параметром 14442.

Пример вывода:
3642

Требования:
1. Метод getSecondsAfter15 должен быть публичным и статическим.
2. Метод getSecondsAfter15 должен возвращать значение типа int.
3. Метод getSecondsAfter15 не должен ничего выводить на экран.
4. Метод getSecondsAfter15 должен правильно возвращать количество секунд, прошедших после 15:00.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {

        return seconds % 3600;
        //напишите тут ваш код
    }
}