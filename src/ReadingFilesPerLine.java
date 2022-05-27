import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        List <String> list = read(response);
        System.out.println(list);
    }
    public static List<String> read(String file) {
        List<String> readList = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(readList::add);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return readList;
    }
}