import static java.lang.Integer.toBinaryString;

public class VariablesTheme {
   public static void main(String[] args) {
       System.out.println("\n1. Вывод значений переменных на консоль.");
               byte b = 4;
               System.out.println("\nКоличество ядер: " + b);
               short s = (short) 2.4;
               System.out.println("\nЧастота процессора: " + s);
               int i = 5000;
               System.out.println("\nЧастота шины: " + i);
               long l1 = 376;
               long l2 = 260;
               long l3 = 30;
               System.out.println("\nРазмеры (ШxВxГ): " + l1 + "x" + l2 + "x" + l3);
               float f = 2.44f;
               System.out.println("\nВес (нетто): " + f);
               double d = 15.6;
               System.out.println("\nДиагональ: " + d);
               char ch1 = (char) 51;
               System.out.println("\nL2 Кэш: " + ch1 + "Кб");
               boolean bo = false;
               System.out.println("\nПрограммное обеспечение: " + bo);
       System.out.println("\n2. Расчет стоимости товара со скидкой.");
               int x = 100;
               int y = 200;
               int I = x + y;
               int II = (int) (I *0.11);
               int III = I - II;
               System.out.println("\nОбщая стоимость товаров без скидки: " + I);
               System.out.println("\nОбщая стоимость скидки: " + II);
               System.out.println("\nОбщая стоимость товаров со скидкой: " + III);
       System.out.println("\n3. Вывод слова JAVA.");
               System.out.println("\n   J    a  v     v  a ");
               System.out.println("   J   a a  v   v  a a    ");
               System.out.println("J  J  aaaaa  V V  aaaaa   ");
               System.out.println(" JJ  a     a  V  a     a");
       System.out.println("\n4. Вывод min и max значений целых числовых типов.");
               byte bmx = 127;
               System.out.println("\nпервоначальное значение byte = " + bmx);
               System.out.println("\nзначение после инкремента byte = " + bmx++);
               System.out.println("\nзначение после декремента byte = " + bmx--);
               short smx = 32_767;
               System.out.println("\nпервоначальное значение short = " + smx);
               System.out.println("\nзначение после инкремента short = " + smx++);
               System.out.println("\nзначение после декремента short = " + smx--);
               int imx = 2_147_483_647;
               System.out.println("\nпервоначальное значение int = " + imx);
               System.out.println("\nзначение после инкремента int = " + imx++);
               System.out.println("\nзначение после декремента int = " + imx--);
               long lmx = 9_223_372_036_854_775_807L;
               System.out.println("\nпервоначальное значение long = " + lmx);
               System.out.println("\nзначение после инкремента long = " + lmx++);
               System.out.print("\nзначение после декремента long = " + lmx--);
       System.out.println("\n\n5. Перестановка значений переменных.");
               int i1 = 2;
               int i2 = 5;
               System.out.println("\nа) Перестановка с помощью третьей переменной:");
               System.out.println("\nИсходные значения переменных: i1 = " + i1 + ", i2 = " + i2);
               i = i1;
               i1 = i2;
               i2 = i;
               System.out.println("\nНовые значения переменных: i1 = " + i1 + ", i2 = " + i2);
               System.out.println("\nб) Перестановка с помощью арифметических операций:");
               System.out.println("\nИсходные значения переменных: i1 = " + i1 + ", i2 = " + i2);
               i = i1 - i2;
               i1 = i1 - i;
               i2 = i2 + i;
               System.out.println("\nНовые значения переменных: i1 = " + i1 + ", i2 = " + i2);
               System.out.println("\nв) Перестановка с помощью побитовой операции ^:");
               System.out.println("\nИсходные значения переменных: i1 = " + i1 + ", i2 = " + i2);
               int i3 = i1 ^ i2;
               i1 = i3 ^ i1;
               i2 = i3 ^ i2;
               System.out.print("\nНовые значения переменных: i1 = " + i1 + ", i2 = " + i2);
       System.out.println("\n\n6. Вывод символов и их кодов.");
               char t = '#';
               System.out.println(t + " = 35");
               char t1 = '&';
               System.out.println(t1 + " = 38");
               char t2 = '@';
               System.out.println(t2 + " = 64");
               char t3 = '^';
               System.out.println(t3 + " = 94");
               char t4 = '_';
               System.out.print(t4 + " = 95");
       System.out.println("\n\n7. Вывод в консоль ASCII-арт Дюка.");
               t = '/';
               t1 = '\\';
               t2 = '(';
               t3 = ')';
               System.out.print("    ");
               System.out.print(t);
               System.out.println(t1);
               System.out.println("   " + t + "  " + t1);
               System.out.println("  " + t + t4 + t2 + " " + t3 + t1);
               System.out.println(" " + t + "      " + t1);
               System.out.print(t);
               System.out.print(t4);
               System.out.print(t4);
               System.out.print(t4);
               System.out.print(t4);
               System.out.print(t);
               System.out.print(t1);
               System.out.print(t4);
               System.out.print(t4);
               System.out.print(t1);
       System.out.println("\n\n8. Вывод количества сотен, десятков и единиц числа.");
           int N = 123;
           int X = N / 100;
           int Y = (N - (X * 100)) / 10;
           int Z = N % 10;
           System.out.println("Число " + N + " содержит:");
           System.out.println( X + " сотен\n" + Y + " десятков\n" + Z + " единиц");
           int sum = X + Y + Z;
           int multiplication = X * Y * Z;
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