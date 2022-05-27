import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(true){
            System.out.println("Enter a number");
            String response = scanner.nextLine();
            if(response.equals("end")){
                break;
            }
            list.add(Integer.valueOf(response));
        }
        List<Integer> list1 = positive(list);
        System.out.println(list1);
    }
    public static List<Integer> positive(List<Integer> numbers){
        System.out.println("Positive numbers");
        return numbers
                .stream()
                .filter(number -> number > 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}