package ss16_file.exercise.count_character;

import java.io.*;

public class Input {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss16_file\\exercise\\count_character\\input.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        int count = 0;

        File file1 = new File("src\\ss16_file\\exercise\\count_character\\output.csv");
        FileWriter fileWriter = new FileWriter(file1);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        while ((line = bufferedReader.readLine())!= null){
            bufferedWriter.write(line);
            count  += line.length();

        }
        bufferedWriter.write("So ki tu xuat hien: "+count +"\n");
        bufferedReader.close();
        bufferedWriter.close();
    }
}
