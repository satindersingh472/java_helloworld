import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> random_values = new ArrayList<>();
        random_values.add(1);
        random_values.add(3);
        random_values.add(7);
        random_values.add(8);
        random_values.forEach(number -> {
            number = number * 2;
            System.out.printf("%d ",number);
        });
        }
    }
