package lectures.workingWithFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.List;

/**
 * 
 */
public class Main {

  public static void main(String[] args) throws URISyntaxException, IOException {
    Path path = Path.of("./numbers.txt");
    System.out.println(path.getFileName());
    boolean exists = Files.exists(path);
    System.out.println("Does file exists: " + exists);

    path = Path.of("/Users/thanh_da/Documents/projects/java101/thaoCT/lectures/workingWithFiles/numbers2.txt");
    System.out.println(path.getFileName());
    exists = Files.exists(path);
    FileTime lastModifiedTime = Files.getLastModifiedTime(path);
    System.out.println("Last modified time: " + lastModifiedTime);
    System.out.println("Does file exists: " + exists);

    // Tạo file mới:
    Path newDirectory = Files.createDirectories(path.getParent().resolve("some/new/dir"));
    System.out.println("newDirectory = " + newDirectory);

    // Path newFile = null;

    // if (!Files.exists(newDirectory.resolve("emptyFile.txt"))) {
    // newFile = Files.createFile(newDirectory.resolve("emptyFile.txt"));
    // System.out.println("newFile = " + newFile);
    // }

    // // Viết nội dung vào file mới
    // if (newFile != null) {
    // Files.writeString(newFile, "Xin chào mọi người");
    // Files.writeString(newFile, "Xin chào mọi người");
    // Files.writeString(newFile, "Xin chào mọi người");
    // Files.writeString(newFile, "Xin chào mọi người");
    // }

    // Specify the path to the file

    String[] _lines = {
        "Hello, World!",
        "This is the second line.",
        "And this is the third line."
    };

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(newDirectory.resolve("emptyFile.txt").toString()))) {
      for (String line : _lines) {
        writer.write(line);
        writer.newLine(); // Add a new line
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      // Read all lines from the file into a List<String>
      List<String> lines = Files.readAllLines(newDirectory.resolve("emptyFile.txt"));

      // Print each line
      for (String line : lines) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
