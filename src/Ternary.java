public class Ternary {

    private static int count = 0;
    private static double f(double x){
        return Math.pow(x, 2);
    }

    public static void search(double a, double b, double eps){

        // Количество итераций согласно формуле
        int k = (int) Math.ceil(Math.log((2*eps) / (b - a)) / Math.log(2/3.0));
        System.out.println("Количество итераций по формуле: " + k);

        // Количество вычислений функции согласно формуле
        System.out.println("Количество вычислений функции по формуле: " + k * 2 + "\n");

        // Результат работы алгоритма
        System.out.printf("%3s%10s%10s%10s%10s%10s%10s%10s\n",
                "k", "length", "a", "b", "left", "right", "f_left", "f_right");
        recursive(a, b, eps);
    }

    public static double recursive(double a, double b, double eps){

        double length = b - a;

        if (length <= 2 * eps) {
            System.out.printf("Минимальное значение функции: %10f\n", f(a + length / 2));
            return f(a + length / 2);
        }

        double x_left = a + length * (1/3.0);
        double x_right = b - length * (1/3.0);

        double f_left = f(x_left);
        double f_right = f(x_right);

        System.out.printf("%3d%10f%10f%10f%10f%10f%10f%10f\n",
                count, length, a, b, x_left, x_right, f_left, f_right);
        count++;

        if (f_left < f_right)  return recursive(a, x_right, eps);
        else return recursive(x_left, b, eps);

    }

}
