public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int myAge = 41;
        if (myAge > 20) {
            System.out.println("Сходите в аптеку.");
        } else {
            System.out.println("Идите делать уроки.");
        }
        boolean male = false;
        if (!male) {
            System.out.println("Сходите на ноготочки.");
        } else {
            System.out.println("Забейте гвоздь.");
        }
        int myHeight = 100;
        if (myHeight < 180) {
            System.out.println("Все маленькие такие злые?");
        } else {
            System.out.println("Как погодка наверху?");
        }
        int firstLetterOfName = "Irma".charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Возможно Вас зовут Махаил или Милана");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Возможно Вас зовут Игорь или Ирина");
        } else {
            System.out.println("Вас зовут не Махаил, не Игорь, не Ирина и не Милана");
        }

        System.out.println("\n2. Поиск max и min числа");
        int firstVeriable = 2342;
        int secondVeriable = 232342;
        boolean maxVeriable = firstVeriable - secondVeriable == 0;
        if (maxVeriable == true) {
            System.out.println("Числа равны. ");
        } else if (maxVeriable == false) {
            maxVeriable = firstVeriable - secondVeriable > 0;
            if (maxVeriable == true) {
                System.out.println("Max число = " + firstVeriable + ". Min число = " + secondVeriable);
            } else {
                System.out.println("Min число = " + firstVeriable + ". Max число = " + secondVeriable);
            }
        }
        System.out.println("\n3. Проверка числа");
        int myVeriable = -657;
        boolean myVeriable1 = myVeriable == 0;
        if (myVeriable1 == true) {
            System.out.println("Число равно нулю. ");
        } else if (myVeriable1 == false) {
            boolean myVeriable2 = myVeriable % 2 == 0;
            if (myVeriable2 == true) {
                System.out.println("Число = " + myVeriable + " является четным.");
            } else if (myVeriable2 == false) {
                System.out.println("Число = " + myVeriable + " является нечетным.");
            }
            if (myVeriable > 0) {
                System.out.println("Число = " + myVeriable + " больше нуля");
            } else {
                System.out.println("Число = " + myVeriable + " меньше нуля");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int threeDigitInteger1 = 321;
        int threeDigitInteger2 = 323;
        System.out.println("Исходные числа " + threeDigitInteger1 + " и " + threeDigitInteger2);
        boolean hundreds = threeDigitInteger1 / 100 == threeDigitInteger2 / 100;
        if (hundreds == true) {
            System.out.println("Числа равны по первому разряду = " + threeDigitInteger1 / 100);
        }
        boolean tens = threeDigitInteger1 % 100 / 10 == threeDigitInteger2 % 100 / 10;
        if (tens == true) {
            System.out.println("Числа равны по второму разряду = " + threeDigitInteger1 % 100 / 10);
        }
        boolean ones = threeDigitInteger1 % 10 == threeDigitInteger2 % 10;
        if (ones == true) {
            System.out.println("Числа равны по третьему разряду " + threeDigitInteger1 % 10);
        }

        System.out.println("\n5. Определение символа по его коду");
        char characterOrDigit = '\u0057';
        boolean characterOrDigit1 = characterOrDigit < 10;
        if (characterOrDigit1 == true) {
            System.out.println("значение u0057 = " + characterOrDigit + "является числом от 0 до 9");
        } else if (characterOrDigit1 == false) {
            boolean characterOrDigit2 = (characterOrDigit >= 'a') || (characterOrDigit <= 'z');
            if (characterOrDigit2 == true) {
                System.out.println("значение u0057 = " + characterOrDigit + "является маленькой буквой от a до z");
            } else if (characterOrDigit2 == false) {
                boolean characterOrDigit3 = (characterOrDigit >= 'A' || characterOrDigit <= 'Z');
                if (characterOrDigit3 == true) {
                    System.out.println("значение u0057 = " + characterOrDigit + " является заглавной буквой от A до Z");
                }
            }
        }
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int investment = 500_000;
        System.out.println("Сумма вклада = " + investment);
        if (investment < 100_000) {
            int percent1 = (int) (investment * 0.05);
            System.out.println("начисленный % = " + percent1);
            investment += percent1;
            System.out.println("итоговая сумма с % = " + investment);
        } else if (investment <= 300_000) {
            int percent2 = (int) (investment * 0.07);
            System.out.println("начисленный % = " + percent2);
            investment += percent2;
            System.out.println("итоговая сумма с % = " + investment);
        } else if (investment > 300_000) {
            int percent3 = (int) (investment * 0.1);
            System.out.println("начисленный % = " + percent3);
            investment += percent3;
            System.out.println("итоговая сумма с % = " + investment);
        }

        System.out.println("\n7. Определение оценки по предметам");
        int historyScore = 59;
        if (historyScore <= 60) {
            System.out.println("2 история");
        } else if (historyScore > 60 && historyScore <= 73) {
            System.out.println("3 история");
        } else if (historyScore > 73 && historyScore <= 91) {
            System.out.println("4 история");
        } else if (historyScore > 91) {
            System.out.println("5 история");
        }
        int programmingScore = 91;
        if (programmingScore <= 60) {
            System.out.println("2 программирование");
        } else if (programmingScore > 60 && programmingScore <= 73) {
            System.out.println("3 программирование");
        } else if (programmingScore > 73 && programmingScore <= 91) {
            System.out.println("4 программирование");
        } else if (programmingScore > 91) {
            System.out.println("5 программирование");
        }
        int averageScore = (historyScore + programmingScore) / 2;
        System.out.println("средний балл оценок по предметам " + averageScore);
        double averagePercentScore = averageScore;
        System.out.println("средний % оценок по предметам " + averagePercentScore + "%");

        System.out.println("\n8. Расчет прибыли за год");
        int rentForMonth = 5000;
        int valueOfSold = 13000;
        int costPrice = 9000;
        int rentForYear = rentForMonth * 12;
        int valueOfSoldForYear = valueOfSold * 12;
        int costPriceForYear = costPrice * 12;
        int profitForYear = valueOfSoldForYear - costPriceForYear - rentForYear;
        if (profitForYear > 0) {
            System.out.println("прибыль за год: +" + profitForYear);
        } else {
            System.out.println("прибыль за год: " + profitForYear);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int money = 567;
        int hundredDollarsInATM = 10;
        int tensDollarsInATM = 5;
        int onesDollarsInATM = 50;
        int hundredsMoney = money / 100;
        int tensMoney = money % 100 / 10;
        int onesMoney = money % 10;
        int moneyInATM = hundredDollarsInATM * 100 + tensDollarsInATM * 10 + onesDollarsInATM * 1;
        if (money <= moneyInATM) {
            if (hundredsMoney < hundredDollarsInATM) {
                System.out.println(hundredsMoney + " банкнот сотнями");
            } else {
                System.out.println(hundredDollarsInATM + " банкнот сотнями");
            }
            int remains = hundredsMoney - hundredDollarsInATM;
            if (remains < 0) {
            } else {
                tensMoney += remains * 10;
            }
            if (tensMoney < tensDollarsInATM) {
                System.out.println(tensMoney + " банкнот десятками");
            } else {
                System.out.println(tensDollarsInATM + " банкнот десятками");
            }
            remains = tensMoney - tensDollarsInATM;
            if (remains < 0) {
            } else {
                onesMoney += remains * 10;
            }
            if (onesMoney < onesDollarsInATM) {
                System.out.println(onesMoney + " банкнот единицами");
            }
            System.out.println("Сумма к выдаче: " + money);
        } else {
            System.out.println("В банкомате не хватает банкнот для выдачи нужной суммы.");
            System.out.println("Введите сумму меньше или попробуйте позднее");
        }
    }
}

