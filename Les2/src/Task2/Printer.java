package Task2;

import java.util.Arrays;

class Expr {

    public static double expr(int[] intArray, int d) {
        // Введите свое решение ниже
        double res = Double.NaN;

        if(d == 0) System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
        else {
            try {
                res = (double) intArray[8] / d;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            }
            // ХЕРНЮ ПРЕДЛАГАЮТ АВТОТЕСТЫ ЛУЧШЕ ОБРАБОТАТЬ ОШИБКУ ДДЕЛЕНИЯ НА 0 ЧЕРЕЗ ARITHMETIC EXCEPTION        }

        return res;
    }
        return res;
    }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer {
    public static void main(String[] args) {
        int[] intArray;
        int d;

        if (args.length == 0) {
            intArray = new int[]{0, 1, 2, 3, 4, 5, 6};
            d = 0; // По умолчанию используем 0, если аргумент не передан
        } else {
            intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
            d = Integer.parseInt(args[1]); // Можно использовать значение по умолчанию или передать его как аргумент.
        }

        double result = Expr.expr(intArray, d);
        if(Double.isNaN(result)) System.out.println(result);
        else {
            System.out.format("intArray[8] / d = %d / %d = %.1f", intArray[8], d, result);
            System.out.println();
            System.out.format("%.1f", result);
        }
    }
}