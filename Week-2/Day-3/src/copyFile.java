import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class copyFile {
    public static void main(String[] args) {         
        
       if (args.equals("Hello")) {
           System.out.println("Hello {User.name}");
       } else if (args.equals("Hi")) {
           System.out.println("Hi {User.name");
       }
    }
}

    public static boolean copyPaste(){
        try {
            System.out.println();
            System.out.println("What is the filename of the file to be copied?");
            Scanner scanner = new Scanner(System.in);
            String originalFileName = scanner.nextLine();
            System.out.println();
            System.out.println("What is the filename of the clone file?");
            String cloneFileName = scanner.nextLine();

            String pathOriginalFile = "src/" + originalFileName;
            String pathCloneFIle = "src/" + cloneFileName;

            Path path = Paths.get(pathOriginalFile);
            Path path2 = Paths.get(pathCloneFIle);
            List<String> originalFile = Files.readAllLines(path);
            List<String> cloneFile = new ArrayList<>(originalFile);

           Files.write(path2, cloneFile);

           boolean cloningSuccess = true;
           return cloningSuccess;

        } catch (IOException e) {
            boolean cloningSucess = false;
            return cloningSucess;
        }
    }
}
