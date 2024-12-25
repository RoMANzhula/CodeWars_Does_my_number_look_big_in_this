public class Main {
    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
    }

    public static boolean isNarcissistic(int number) { // метод, який буде визначати нарцисичне число (або число Армстронга) - це
        // число, яке дорівнює сумі елементів числа number, піднятих в ступінь, рівний довжині числа (153 --- 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
        int count = 0; // змінна-лічильник
        String numberStr = String.valueOf(number); // перетворюємо число в рядок
        char[] ch = numberStr.toCharArray(); // перетворюємо рядок в символи (зберігаємо їх у масиві)
        for (char c : ch) { // проходимо по масиву елементів (по кожній цифрі окремо)
            int mathPow = (int) Math.pow(Double.parseDouble(String.valueOf(c)), ch.length); // створюємо змінну = числу,
            // піднятих в ступінь (тут кожна цифра з масиву буде по черзі піднята в ступінь, але її потрібно спершу перетворити на число,
            // інакше перетворення з char дасть великі цифри)
            count = count + mathPow; // з кожною ітерацією збільшуємо змінну-лічильник на кожне число, підняте в ступінь
        }
        return count == number; // і повертаємо результат у вигляді true/false: якщо лічильник = перевірюваному числу, то повертаємо true,
        // в іншому випадку повертаємо false
    }
}
