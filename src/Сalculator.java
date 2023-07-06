import java.util.Random;

public class calculator {

    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int operator = random.nextInt(6);
        String sign = "";
        int result;
        int result2 = 1;


        if (operator == 0) {
            result = a + b;
            sign = "+";
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (operator == 1) {
            result = a - b;
            sign = "-";
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (operator == 2) {
            result = a * b;
            sign = "*";
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (operator == 3) {
            if (b != 0) {
                result = a / b;
                sign = "/";
                System.out.println(a + " " + sign + " " + b + " = " + result);
            } else {
                System.out.println("На ноль делить нельзя!");
                return;
            }
        } else if (operator == 4) {
            if (b != 0) {
                result = a % b;
                sign = "%";
                System.out.println(a + " " + sign + " " + b + " = " + result);
            } else {
                System.out.println("На ноль делить нельзя!");
                return;
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (operator == 5) {
            for (int i = 0; i < b; i++) {
                result2 = result2 * a;
            }
            sign = "+";
            System.out.println(a + " " + sign + " " + b + " = " + result2);
        }
    }
}


