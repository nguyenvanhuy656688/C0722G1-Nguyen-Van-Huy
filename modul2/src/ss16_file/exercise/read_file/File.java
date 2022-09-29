package ss16_file.exercise.read_file;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class File {


    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("src\\ss16_file\\exercise\\read_file\\input.cvs");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        List<Nation> nationList = new ArrayList<>();
        String line;
        String [] info;
        Nation nation;
        while ((line=bufferedReader.readLine())!=null){
            info = line.split(",");
            nation = new Nation(Integer.parseInt(info[0]),info[1],info[2]);
            nationList.add(nation);
        }
        bufferedReader.close();
        for (Nation nation1 : nationList){
            System.out.println(nation1.getName());
        }
    }
}
