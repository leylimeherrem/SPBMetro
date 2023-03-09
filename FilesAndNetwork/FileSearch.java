import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearch {
    public static void search(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File file : list) {
            if (file.isDirectory()) {
                search(file.getAbsolutePath());
            } else {
                String fileName = file.getName().toLowerCase();
                if (fileName.endsWith(".json")) {
                    System.out.println("Found JSON file: " + file.getAbsolutePath());
                } else if (fileName.endsWith(".csv")) {
                    System.out.println("Found CSV file: " + file.getAbsolutePath());
                }
            }
        }
    }
}