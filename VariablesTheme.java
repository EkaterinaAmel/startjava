public class VariablesTheme {
   public static void main(String[] args) {
       System.out.println("\n1. Вывод значений переменных на консоль.");
           byte core = 4;
           System.out.println("\nКоличество ядер: " + core);
           short processor = (short) 2.4;
      System.out.println("\nЧастота процессора: " + processor);
           int tire = 5000;
           System.out.println("\nЧастота шины: " + tire);
           long wide = 376;
           long height = 260;
           long depth = 30;
           System.out.println("\nРазмеры (ШxВxГ): " + wide + "x" + heih + "x" + depth);
           float weight = 2.44f;
           System.out.println("\nВес (нетто): " + weight);
           double diagonal = 15.6;
           System.out.println("\nДиагональ: " + diagonal);
           char cache = (char) 51;
           System.out.println("\nL2 Кэш: " + cache + "Кб");
           boolean software = false;
           System.out.println("\nПрограммное обеспечение: " + software);
      
       System.out.println("\n2. Расчет стоимости товара со скидкой.");
           int pencil = 100;
           int pen = 200;
           int startingPrice = pencil + pen;
           int discont = (int) (startingPrice * 0.11);
           int theFinalPrice = startingPrice - discont;
           System.out.println("\nОбщая стоимость товаров без скидки: " + startingPrice);
           System.out.println("\nОбщая стоимость скидки: " + discont);
           System.out.println("\nОбщая стоимость товаров со скидкой: " + theFinalPrice);
      
       System.out.println("\n3. Вывод слова JAVA.");
           System.out.println("\n   J    a  v     v  a ");
           System.out.println("   J   a a  v   v  a a    ");
           System.out.println("J  J  aaaaa  V V  aaaaa   ");
           System.out.println(" JJ  a     a  V  a     a");
      
       System.out.println("\n4. Вывод min и max значений целых числовых типов.");
           byte byteMax = 127;
           System.out.println("\nпервоначальное значение byte = " + byteMax);
           System.out.println("\nзначение после инкремента byte = " + byteMax++);
           System.out.println("\nзначение после декремента byte = " + byteMax--);
           short shortMax = 32_767;
           System.out.println("\nпервоначальное значение short = " + shortMax);
           System.out.println("\nзначение после инкремента short = " + shortMax++);
           System.out.println("\nзначение после декремента short = " + shortMax--);
           int intMax = 2_147_483_647;
           System.out.println("\nпервоначальное значение int = " + intMax);
           System.out.println("\nзначение после инкремента int = " + intMax++);
           System.out.println("\nзначение после декремента int = " + intMax--);
           long longMax = 9_223_372_036_854_775_807L;
           System.out.println("\nпервоначальное значение long = " + longMax);
           System.out.println("\nзначение после инкремента long = " + longMax++);
           System.out.print("\nзначение после декремента long = " + longMax--);
      
       System.out.println("\n\n5. Перестановка значений переменных.");
           int firstVariable = 2;
           int secondVariable = 5;
           int thirdVariable = firstVariable;
           System.out.println("\nа) Перестановка с помощью третьей переменной:");
           System.out.println("\nИсходные значения переменных: первая переменная = " + firstVariable + ", вторая переменная = " + secondVariable);
           firstVariable = secondVariable;
           secondVariable = thirdVariable;
           System.out.println("\nНовые значения переменных: первая переменная = " + firstVariable + ", вторая переменная = " + secondVariable);
           System.out.println("\nб) Перестановка с помощью арифметических операций:");
           System.out.println("\nИсходные значения переменных: первая переменная = " + firstVariable + ", вторая переменная = " + secondVariable);
           thirdVariable = firstVariable - secondVariable;
           firstVariable = firstVariable - thirdVariable;
           secondVariable = secondVariable + thirdVariable;
           System.out.println("\nНовые значения переменных: первая переменная = " + firstVariable + ", вторая переменная = " + secondVariable);
           System.out.println("\nв) Перестановка с помощью побитовой операции ^:");
           System.out.println("\nИсходные значения переменных: первая переменная = " + firstVariable + ", вторая переменная = " + secondVariable);
           thirdVariable = firstVariable ^ secondVariable;
           firstVariable = thirdVariable ^ firstVariable;
           secondVariable = thirdVariable ^ secondVariable;
           System.out.print("\nНовые значения переменных: первая переменная = " + firstVariable + ", вторая переменная = " + secondVariable);
      
       System.out.println("\n\n6. Вывод символов и их кодов.");
           char symbol = '#';
           System.out.println(symbol + " = 35");
           char symbol1 = '&';
           System.out.println(symbol1 + " = 38");
           char symbol2 = '@';
           System.out.println(symbol2 + " = 64");
           char symbol3 = '^';
           System.out.println(symbol3 + " = 94");
           char symbol4 = '_';
           System.out.print(symbol4 + " = 95");
      
       System.out.println("\n\n7. Вывод в консоль ASCII-арт Дюка.");
           symbol = '/';
           symbol1 = '\\';
           symbol2 = '(';
           symbol3 = ')';
           System.out.print("    ");
           System.out.print(symbol);
           System.out.println(symbol1);
           System.out.println("   " + symbol + "  " + symbol1);
           System.out.println("  " + symbol + symbol4 + symbol2 + " " + symbol3 + symbol1);
           System.out.println(" " + symbol + "      " + symbol1);
           System.out.print(symbol);
           System.out.print(symbol4);
           System.out.print(symbol4);
           System.out.print(symbol4);
           System.out.print(symbol4);
           System.out.print(symbol);
           System.out.print(symbol1);
           System.out.print(symbol4);
           System.out.print(symbol4);
           System.out.print(symbol1);
      
       System.out.println("\n\n8. Вывод количества сотен, десятков и единиц числа.");
           int number = 123;
           int hundreds = number / 100;
           int dozens = (number - (hundreds * 100)) / 10;
           int units = number % 10;
           System.out.println("Число " + number + " содержит:");
           System.out.println( hundreds + " сотен\n" + dozens + " десятков\n" + units + " единиц");
           int sum = hundreds + dozens + units;
           int multiplication = hundreds * dozens * units;
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
