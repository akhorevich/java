import java.util.ArrayList;

public class AverageGeometric {
    ArrayList<Integer> number = new ArrayList<Integer>();
    int a = 1;

    double c = 0;

    double md = 0;

    public AverageGeometric(ArrayList<Integer> number) {
        this.number = number;
        for (int i = 0; i < number.size(); i++) {
            a =a*number.get(i);
            c++;
            md = Math.pow(a,(1/c));
        }

        System.out.println("Среднее геометрическое: " + String.format("%.2f",md));
    }
}
