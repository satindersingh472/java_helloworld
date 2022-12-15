
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] random_values = {1,2,3,4};
        for (int number = 0; number <= random_values.length;number++){
            if (random_values[number] % 2 == 1){
                System.out.println(String.format("%d is a odd number ", random_values[number] ));
            } else {
                System.out.println(random_values[number]);
            }
        }
        }
    }
