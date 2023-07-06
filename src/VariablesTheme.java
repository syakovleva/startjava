public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера");
        byte core = 10;
        short memory = 16;   
        int type = 64;  
        long date = 19052023;  
        float speed = 2.30f;   
        double assembly = 22621.1848f; 
        char socket = 49;  
        boolean OC = true;
        System.out.println(core + " - количество ядер компьютера");
        System.out.println(memory + " - оперативная память компьютера");
        System.out.println(type + " - тип системы");
        System.out.println(date + " - дата установки");
        System.out.println(speed + " - базовая скорость");
        System.out.println(assembly + " - сборка ОС");
        System.out.println(socket + " - сокетов");
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
        byte typeByte = 127;
        System.out.println(typeByte + " -  Max значение типа byte");
        System.out.println(++typeByte + " -  Min значение типа byte");
        System.out.println(--typeByte + " -  Max значение типа byte");
        short typeShort = 32767;
        System.out.println(typeShort + " -  Max значение типа snort");
        System.out.println(++typeShort + " -  Min значение типа snort");
        System.out.println(--typeShort + " -  Max значение типа snort");
        int typeInt = 2147483647;
        System.out.println(typeInt + " -  Max значение типа int");
        System.out.println(++typeInt + " -  Min значение типа int");
        System.out.println(--typeInt + " -  Max значение типа int");
        long typeLong = 9223372036854775807L;
        System.out.println(typeLong + " -  Max значение типа long");
        System.out.println(++typeLong + " -  Min значение типа long");
        System.out.println(--typeLong + " -  Max значение типа long");

        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("\nИспользование временной переменной");
        int a = 2;
        int b = 5;
        System.out.println("До перестановки: " + "\na = " + a + "\nb = " + b);
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("После перестановки: " + "\na = " + a + "\nb = " + b);
        System.out.println("\nИспользование арифметической функции");
        System.out.println("До перестановки: " + "\na = " + a + "\nb = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("После перестановки: " + "\na = " + a + "\nb = " + b);
        System.out.println("\nИспользование побитовой операции");
        System.out.println("До перестановки: " + "\na = " + a + "\nb = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("После перестановки: " + "\na = " + a + "\nb = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char symbolGrid = '#';
        System.out.printf("%-1s %1s %n", (int) symbolGrid, symbolGrid);
        char symbolAnd = '&';
        System.out.printf("%-1s %1s %n", (int) symbolAnd, symbolAnd);
        char symbolDog = '@';
        System.out.printf("%-1s %1s %n", (int) symbolDog, symbolDog);
        char symbolDegree = '^';
        System.out.printf("%-1s %1s %n", (int) symbolDegree, symbolDegree);
        char symbolUnderline = '_';
        System.out.printf("%-1s %1s %n", (int) symbolUnderline, symbolUnderline);

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
        int numHundreds = num / 100;
        int numeTens = num % 100 / 10;
        int numUnits = num % 10;
        int sumNum = numUnits + numeTens + numHundreds;
        int productNum = numUnits * numeTens * numHundreds;
        System.out.println(numHundreds + " сотен\n" + numeTens + " десятков\n" + numUnits + " единиц");
        System.out.println("Сумма его цифр = " + sumNum + "\n Произведение = " + productNum);

        System.out.println("\n9. Вывод времени");
        int sec = 86399;
        int hours = sec / 3600;
        int minutes = (sec % 3600) / 60;
        int seconds = sec % 60;
        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
    }
}





