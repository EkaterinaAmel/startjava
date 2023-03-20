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
        int costOfBook = 200;
        int sumWithoutDiscount = costOfPen + costOfBook;
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
        byteMax--;
        System.out.println("значение после декремента byte = " + byteMax);
        short shortMax = 32_767;
        System.out.println("первоначальное значение short = " + shortMax);
        shortMax++;
        System.out.println("значение после инкремента short = " + ++shortMax);
        shortMax--;
        System.out.println("значение после декремента short = " + shortMax);
        int intMax = 2_147_483_647;
        System.out.println("первоначальное значение int = " + intMax);
        intMax++;
        System.out.println("значение после инкремента int = " + intMax);
        intMax--;
        System.out.println("значение после декремента int = " + intMax);
        long longMax = 9_223_372_036_854_775_807L;
        System.out.println("первоначальное значение long = " + longMax);
        longMax++;
        System.out.println("значение после инкремента long = " + longMax);
        longMax--;
        System.out.println("значение после декремента long = " + longMax);

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
        System.out.println(sharp + " = " + (int) sharp);
        char ampersand = '&';
        System.out.println(ampersand + " = " + (int) ampersand);
        char at = '@';
        System.out.println(at + " = " + (int) at);
        char caret = '^';
        System.out.println(caret + " = " + (int) caret);
        char underscore = '_';
        System.out.print(underscore + " = " + (int) underscore);

    System.out.println("\n\n7. Вывод в консоль ASCII-арт Дюка.");
        char slash = '/';
        char backslash = '\\';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        System.out.println("     " + slash + backslash + " ");
        System.out.println("    " + slash + "  " + backslash);
        System.out.println("   " + slash + underscore + openParenthesis + " " + closeParenthesis + backslash);
        System.out.println("  " + slash + "      " + backslash);
        System.out.print(" " + slash + underscore + underscore + underscore + underscore + slash + backslash);
        System.out.print(underscore);
        System.out.print(underscore);
        System.out.print(backslash);

    System.out.println("\n\n8. Вывод количества сотен, десятков и единиц числа.");
        int number = 123;
        int hundreds = number / 100;
        int tens = number % 100 / 10;
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
        int minutes = seconds % 3600 / 60;
        seconds = seconds % minutes;
        System.out.println("В 86399 секундах содержится " + hours + ":" + minutes + ":" + seconds);
    }
}
