package task;

import org.testng.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Optional;

import static org.testng.Assert.assertTrue;

public class LastFile {
    public static void main(String[] args) throws IOException {

        Path dir = Paths.get("/Users/yerkenazbayetova/Downloads");  // specify your directory

        Optional<Path> lastFilePath = Files.list(dir)    // here we get the stream with full directory listing
                .filter(f -> !Files.isDirectory(f))  // exclude subdirectories from listing
                .max(Comparator.comparingLong(f -> f.toFile().lastModified()));  // finally get the last file using simple comparator by lastModified field


        System.out.println(lastFilePath.get().getFileName());


   //     assertTrue(lastFilePath.get().getFileName().startsWith("pexels"));
        }


    }

