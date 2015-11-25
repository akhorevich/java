import java.util.ArrayList;

public class AverageArithmetic {
    ArrayList<Integer> number = new ArrayList<Integer>();
    int a = 0;
    int md = 0;

    public AverageArithmetic(ArrayList<Integer> number) {
        this.number = number;
        for (int i = 0; i < number.size(); i++) {
            a += number.get(i);
            md = a/number.size();
        }
        System.out.println("Среднее арифметическое: "+md);
    }
}
