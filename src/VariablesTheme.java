public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера");
        byte core = 10;
        System.out.println(core + " - количество ядер компьютера");
        short memory = 16;
        System.out.println(memory + " - оперативная память компьютера");
        int type = 64;
        System.out.println(type + " - тип системы");
        long date = 19052023;
        System.out.println(date + " - дата установки");
        float speed = 2.30f;
        System.out.println(speed + " - базовая скорость");
        double assembly = 22621.1848f;
        System.out.println(assembly + " - сборка ОС");
        char socket = 49;
        System.out.println(socket + " - сокетов");
        boolean OC = true;
        System.out.println("На компьютере установлена ОС Windows 11 - " + OC);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        double num1 = 100;
        double num2 = 200;
        double sum = num1 + num2; // сумма товаров
        double discount_percent = 11; // величина скидки в процентах
        double discount_value = sum * discount_percent / 100; // величина скидки в рублях
        double new_price = sum - discount_value; // новая цена за вычетом скидки
        System.out.println(sum);
        System.out.println(new_price);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte n1 = 127;
        System.out.println(n1);
        System.out.println(++n1);
        System.out.println(--n1);
        short n2 = 32767;
        System.out.println(n2);
        System.out.println(++n2);
        System.out.println(--n2);
        int n3 = 2147483647;
        System.out.println(n3);
        System.out.println(++n3);
        System.out.println(--n3);
        long n4 = 9223372036854775807L;
        System.out.println(n4);
        System.out.println(++n4);
        System.out.println(--n4);

        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("\nИспользование временной переменной");
        int a = 2;
        int b = 5;
        System.out.println("a = " + a + "\nb = " + b);
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("a = " + a + "\nb = " + b);
        System.out.println("\nИспользование арифметической функции");
        System.out.println("a = " + a + "\nb = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + "\nb = " + b);
        System.out.println("\nИспользование побитовой операции");
        System.out.println("a = " + a + "\nb = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a = " + a + "\nb = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char s1 = '#';
        System.out.printf("%-1s %1s %n", (int) s1, s1);
        char s2 = '&';
        System.out.printf("%-1s %1s %n", (int) s2, s2);
        char s3 = '@';
        System.out.printf("%-1s %1s %n", (int) s3, s3);
        char s4 = '^';
        System.out.printf("%-1s %1s %n", (int) s4, s4);
        char s5 = '_';
        System.out.printf("%-1s %1s %n", (int) s5, s5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        String ch1 = "/";
        String ch2 = "\\";
        String ch3 = "_";
        String ch4 = "(";
        String ch5 = ")";
        System.out.printf("%5s%-5s\n", ch1, ch2);

        System.out.printf("%4s%2s%-4s\n", ch1, "", ch2);

        System.out.printf("%3s%1s%1s%2s%-3s\n", ch1, ch3, ch4, ch5, ch2);

        System.out.printf("%2s%7s\n", ch1, ch2);

        System.out.printf("%s%s%s%s%s%s%s%s%s%s", ch1, ch3, ch3, ch3, ch3, ch1, ch2, ch3, ch3, ch2);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int first = num / 100;
        int second = num % 100 / 10;
        int third = num % 10;
        int sum1 = first + second + third;
        int sum2 = first * second * third;
        System.out.println(third + " сотен\n" + second + " десятков\n" + first + " единиц");
        System.out.println("Сумма его цифр = " + sum1 + "\n Произведение = " + sum2);

        System.out.println("\n9. Вывод времени");
        int sec = 86399;
        int hours = sec / 3600;
        int minutes = (sec % 3600) / 60;
        int seconds = sec % 60;
        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
    }
}





