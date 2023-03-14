public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод значений переменных на консоль.");
        byte core = 4;
        System.out.print("\nКоличество ядер: " + core);
        short monitor = (short) 1;
        System.out.print("\nМониторов: " + monitor);
        int tire = 5000;
        System.out.print("\nЧастота шины: " + tire);
        long wide = 376;
        long height = 260;
        long depth = 30;
        System.out.print("\nРазмеры (ШxВxГ): " + wide + "x" + height + "x" + depth);
        float weight = 2.44f;
        System.out.print("\nВес (нетто): " + weight);
        double diagonal = 15.6;
        System.out.print("\nДиагональ: " + diagonal);
        char cache1 = 56;
        char cache2 = 49;
        System.out.print("\nL2 Кэш: " + cache1 + cache2 + "Кб");
        boolean nonWorking = false;
        System.out.println("\nПрограммное обеспечение: " + nonWorking);

        System.out.print("\n2. Расчет стоимости товара со скидкой.");
        int costOfPen = 100;
        int costOfbook = 200;
        int sumWithoutDiscount = costOfPen + costOfbook;
        int discontSum = (int) (sumWithoutDiscount * 0.11);
        int discountPrice = sumWithoutDiscount - discontSum;
        System.out.println("Общая стоимость товаров без скидки: " + sumWithoutDiscount);
        System.out.println("Общая стоимость скидки: " + discontSum);
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice);

        System.out.print("\n3. Вывод слова JAVA.");
        System.out.println("\n   J    a  v     v  a ");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa   ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов.");
        byte byteMax = 127;
        System.out.println("первоначальное значение byte = " + byteMax);
        byteMax++;
        System.out.println("значение после инкремента byte = " + byteMax);
        byte byteMaxDecrement = 127;
        byteMaxDecrement--;
        System.out.println("значение после декремента byte = " + byteMaxDecrement);
        short shortMax = 32_767;
        System.out.println("первоначальное значение short = " + shortMax);
        shortMax++;
        System.out.println("значение после инкремента short = " + ++shortMax);
        short shortMaxDecrement = 32_767;
        shortMaxDecrement--;
        System.out.println("значение после декремента short = " + shortMaxDecrement);
        int intMax = 2_147_483_647;
        System.out.println("первоначальное значение int = " + intMax);
        intMax++;
        System.out.println("значение после инкремента int = " + intMax);
        int intMaxDecrement = 2_147_483_647;
        intMaxDecrement--;
        System.out.println("значение после декремента int = " + intMaxDecrement);
        long longMax = 9_223_372_036_854_775_807L;
        System.out.println("первоначальное значение long = " + longMax);
        longMax++;
        System.out.println("значение после инкремента long = " + longMax);
        long longMaxDecrement = 9_223_372_036_854_775_807L;
        longMaxDecrement--;
        System.out.println("значение после декремента long = " + longMaxDecrement);

        System.out.println("\n5. Перестановка значений переменных.");
        int number1 = 2;
        int number2 = 5;
        int temp = number1;
        System.out.println("а) Перестановка с помощью третьей переменной:");
        System.out.print("Исходные значения переменных: первая переменная = ");
        System.out.println(number1 + ", вторая переменная = " + number2);
        number1 = number2;
        number2 = temp;
        System.out.print("Новые значения переменных: первая переменная = ");
        System.out.println(number1 + ", вторая переменная = " + number2);
        System.out.println("б) Перестановка с помощью арифметических операций:");
        System.out.print("Исходные значения переменных: первая переменная = ");
        System.out.println(number1 + ", вторая переменная = " + number2);
        temp = number1 - number2;
        number1 -= temp;
        number2 += temp;
        System.out.print("Новые значения переменных: первая переменная = ");
        System.out.println(number1 + ", вторая переменная = " + number2);
        System.out.println("в) Перестановка с помощью побитовой операции ^:");
        System.out.print("Исходные значения переменных: первая переменная = ");
        System.out.println(number1 + ", вторая переменная = " + number2);
                temp = number1 ^ number2;
        number1 ^= temp;
        number2 ^= temp;
        System.out.print("Новые значения переменных: первая переменная = ");
        System.out.println(number1 + ", вторая переменная = " + number2);

                System.out.println("\n\n6. Вывод символов и их кодов.");
        char sharp = '#';
        System.out.println(sharp + " = 35");
        char symbol1 = '&';
        System.out.println(symbol1 + " = 38");
        char symbol2 = '@';
        System.out.println(symbol2 + " = 64");
        char symbol3 = '^';
        System.out.println(symbol3 + " = 94");
        char symbol4 = '_';
        System.out.print(symbol4 + " = 95");

        System.out.println("\n\n7. Вывод в консоль ASCII-арт Дюка.");
        char symbol = '/';
        symbol1 = '\\';
        symbol2 = '(';
        symbol3 = ')';
        System.out.println("     " + symbol + symbol1 + " ");
        System.out.println("    " + symbol + "  " + symbol1);
        System.out.println("   " + symbol + symbol4 + symbol2 + " " + symbol3 + symbol1);
        System.out.println("  " + symbol + "      " + symbol1);
        System.out.print(" " + symbol + symbol4 + symbol4 + symbol4 + symbol4 + symbol + symbol1 + symbol4 + symbol4);
        System.out.print(symbol1);

        System.out.println("\n\n8. Вывод количества сотен, десятков и единиц числа.");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number - (hundreds * 100)) / 10;
        int ones = number % 10;
        System.out.println("Число " + number + " содержит:");
        System.out.println( hundreds + " сотен\n" + tens + " десятков\n" + ones + " единиц");
        int sum = hundreds + tens + ones;
        int multiplication = hundreds * tens * ones;
        System.out.println("Сумма его цифр = " + sum);
        System.out.print("Произведение = " + multiplication);

        System.out.println("\n\n9. Вывод времени.");
        int seconds = 86399;
        int hours = seconds / 3600;
        int minutes = (seconds - (hours * 3600)) / 60;
        seconds = seconds % minutes;
        System.out.println("В 86399 секундах содержится " + hours + ":" + minutes + ":" + seconds);
    }
}
