package ss17_io_binary.exercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập nguồn lấy: ");
        String sourcePath = sc.nextLine();
        System.out.println("Nhập nguồn cần dán tới");
        String sourceDestPath = sc.nextLine();
        File fileSourcePath = new File(sourcePath);
        File fileDestPath = new File(sourceDestPath);

        try{
            copyFileUsingJava7Files(fileSourcePath,fileDestPath);
            copyFileUsingStream(fileSourcePath,fileDestPath);
        }catch (IOException e){
            e.getStackTrace();
            System.out.println("Không tìm thấy file");
        }



    }
}
