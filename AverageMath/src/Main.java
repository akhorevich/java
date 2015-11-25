import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Для получения среднего арифметического числа введите команду по типу: \"am 2 3 4 5\", поочередно вводя числа, разделенные пробелами.\nАналогично для получения среднего геометрического числа введите команду по типу: \"gm 2 3 4 5\".\nДалее нажмите Enter");
        String a;
        Scanner sc;
        String[] b;
        ArrayList<Integer> nums;
        sc = new Scanner(System.in);
        a = sc.nextLine();

        b = a.replaceAll("[^\\d]", "").split("");
        nums =  new ArrayList<Integer>();
        for (int i = 0; i < b.length; i++) {
            nums.add(Integer.parseInt(b[i]));
        }
        if (a.contains("gm")) {
            new AverageGeometric(nums);
        } else if (a.contains("am")) {
            new AverageArithmetic(nums);
        }
    }
}
