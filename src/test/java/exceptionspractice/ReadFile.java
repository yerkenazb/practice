package exceptionspractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args)  {
        String path = "/Users/yerkenazbayetova/Documents/Documents - Yerkenaz’s MacBook Pro/Practice/src/test/java/exceptionspractice/data.txt";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(path);
            BufferedReader reader = new BufferedReader(fileReader);
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("Invalid file path");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading file");
            e.printStackTrace();
        } finally{
            System.out.println("In finally block");
            try{
                fileReader.close();
            }catch (IOException exception){
                System.out.println("Failed to close the reader");
            }
        }
    }
}
