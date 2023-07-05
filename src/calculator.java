public class calculator {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result;

        //здесьвписываем знак (+ - * / % ^)
        String sign = "/";

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
            result = a / b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign.equals("%")) {
            result = a % b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign.equals("^")) {
            System.out.println(a + " " + sign + " " + b + " = " + exponentiation(a, b));
        } else {
            System.out.println("Неверная операция");
        }
    }

    //Метод для возведения в степень
    static int exponentiation(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = result * a;
        }
        return result;
    }
}
