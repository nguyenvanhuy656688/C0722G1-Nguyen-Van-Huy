package ss17_io_binary.exercise.binary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String linkInput = "src\\ss17_io_binary\\exercise\\binary\\path.csv";
        String linkCoppy = "src\\ss17_io_binary\\exercise\\binary\\copypath.csv";
        List<String> strings = new ArrayList<>();
        strings.add("Chào anh Hải");
        strings.add("Em là Huy");
        strings.add("Nice to meet you");
        writeFile(strings, linkInput);
        readFile(strings, linkInput);
        try {
            FileInputStream input = new FileInputStream("src\\ss17_io_binary\\exercise\\binary\\path.csv");
            FileOutputStream coppy = new FileOutputStream("src\\ss17_io_binary\\exercise\\binary\\copypath.csv");
            byte[] bytes = new byte[200];
            int length;
            int count = 0;

            while ((length = input.read(bytes)) > 0) {
                coppy.write(bytes, 0, length);
                count += length;
            }
            System.out.println("Tệp có số bytes là: " + count);
            readFile(strings, linkCoppy);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(List<String> strings, String link) {
        java.io.File file = new java.io.File(link);
        try {
            FileOutputStream outPut = new FileOutputStream(file);
            ObjectOutputStream oBoutPut = new ObjectOutputStream(outPut);
            oBoutPut.writeObject(strings);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(List<String> strings, String link) {
        java.io.File file = new File(link);
        try {
            FileInputStream inPut = new FileInputStream(file);
            ObjectInputStream oBinput = new ObjectInputStream(inPut);
            strings = (List<String>) oBinput.readObject();
            for (String i : strings) {
                System.out.println(i);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

