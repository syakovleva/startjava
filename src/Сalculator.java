public class Calculator {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int result;
        int result2 = 1;

        //здесь вписываем знак (+ - * / % ^)
        String sign = "-";

        if (sign.equals("+")) {
            result = a + b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign.equals("-")) {
            result = a - b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign.equals("*")) {
            result = a * b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign.equals("/")) {
            if (b != 0) {
                result = a / b;
                System.out.println(a + " " + sign + " " + b + " = " + result);
            } else {
                System.out.println("На ноль делить нельзя!");
                return;
            }
        } else if (sign.equals("%")) {
            if (b != 0) {
                result = a % b;
                System.out.println(a + " " + sign + " " + b + " = " + result);
            } else {
                System.out.println("На ноль делить нельзя!");
                return;
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign.equals("^")) {
            for (int i = 0; i < b; i++) {
                result2 = result2 * a;
            }
            System.out.println(a + " " + sign + " " + b + " = " + result2);
        }
    }
}

