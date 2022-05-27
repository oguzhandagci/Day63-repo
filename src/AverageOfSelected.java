import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelected {
    public static void main(String[] args) {

        ArrayList<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String row = scanner.nextLine();

            if (row.equals("end")) {
                break;
            }
            inputs.add(row);
        }

        System.out.println("'n' for negative numbers, p for positive");
        String response = scanner.nextLine();
        if (response.equals("n")) {
            double averageNegative = inputs
                    .stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average is: " + averageNegative);
        } else if (response.equals("p")) {
            double averagePositive = inputs
                    .stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average is: " + averagePositive);
        }
    }
}