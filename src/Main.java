public class Main {
    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
    }

    public static boolean isNarcissistic(int number) { //метод, который будет считать Нарцисное число (или число Армстронга)- это
        //число равное сумме элементов числа number возведенных в степень = длине числа (153 --- 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
        int count = 0; //переменная счетчик
        String numberStr = String.valueOf(number); //преобразуем число в строку
        char[] ch = numberStr.toCharArray(); //преобразуем строку в символы (положив их в массив)
        for (char c : ch) { //проходимся по массиву элементов (по нашей каждой цифре в отдельности)
            int mathPow = (int) Math.pow(Double.parseDouble(String.valueOf(c)), ch.length); //создаем переменную = числу,
            //возведенному в степень (тут каждая цифра из массива будет по-порядку возводиться в степень, но ее нужно запарсить,
            //иначе перевод из char будет давать большие цифры)
            count = count + mathPow; //с каждой итерацией увеличиваем переменную счетчик на каждое число возведенное в степень
        }
        return count == number; //и возвращаем в виде true/false результат - если счетчик = проверяемому числу, то возвращаем true,
        //иначе возвращаем false
    }
}