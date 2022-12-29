import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    //Ternary.search(-1, 1, 0.01);
    double[] arr = new double[] {-1.0, -0.9, -0.8, -0.6, -0.5, -0.4, -0.3, -0.2, -0.1, 0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0};
    System.out.println(Arrays.toString(arr));
    double[] result = Ternary.search_from_array(arr, 0.01);
    }
}