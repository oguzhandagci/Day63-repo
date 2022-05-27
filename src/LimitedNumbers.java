import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int input = scanner.nextInt();
            if(input < 0){
                break;
            }
            list.add(input);
        }
        list.stream().filter(x -> x > 0 && x < 6).forEach(x -> System.out.println(x));
    }
}