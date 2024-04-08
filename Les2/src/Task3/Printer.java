package Task3;

class Expr {

    public static double expr(int a, int b) {
        // Введите свое решение ниже
        double res;

        if(b == 0) res = 0;
        else res = (double) a / b;

        return res;
    }


/*    double res = 0;

        try {
        res = (double) a / b;
    } catch (ArithmeticException e) {
        res = 0;
    }
        return res;*/

    public static void printSum(int a, int b) {
        // Введите свое решение ниже
        System.out.println(a + b);

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 90;
            b = 0; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        double result = Expr.expr(a, b);
        Expr.printSum(a, b);
        System.out.println(result);
    }
}