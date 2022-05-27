import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true){
            System.out.println("Continue personal information input? 'quit' ends:");
            String response = scanner.nextLine();
            if(response.equals("quit")){
                break;
            }
            System.out.println("input first name:");
            String first = scanner.nextLine();
            System.out.println("input last name:");
            String last = scanner.nextLine();
            list.add(last);
            System.out.println("input year of birth");
            String year = scanner.nextLine();
        }
        System.out.println("unique last names in alphabetical order:");
        list.stream().distinct().sorted().forEach(s-> System.out.println(s));

    }
}