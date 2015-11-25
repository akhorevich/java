import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 1 до 9. Любая другая кнопка запустит программу");
        Random r = new Random();
        String a;
        ArrayList<Integer> number = new ArrayList<Integer>();
        do {
            a = scan.nextLine();
            if (isInteger(a)) {
                number.add(Integer.valueOf(a));
            }else {
                System.out.println(number.toString());
                new AverageArithmetic(number);
                new AverageGeometric(number);

            }


        }while (isInteger(a));


    }
    public static boolean isInteger(String s)
    {
        try {
            Integer.parseInt(s);
        }
        catch (Exception e) {
            return false;
        }

        return true;
    }
}
