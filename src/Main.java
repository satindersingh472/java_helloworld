import java.util.Arrays;

public class Main {
    public static void main(String[] args){
    int random_numbers[] = {1,2,10,5,15,20,4,8,6};
    for (int number : random_numbers){
        if (number % 5 == 0 ) {
            System.out.println(number);
        } else {
              System.out.println(String.format(number + " is not divisible by 5"));
            }

    }


    }
}
