import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.*;

public class FileInfo {

    private String path;
    private int fileLength;
    private List<String> fileContent = new ArrayList<String>();


    public FileInfo(String filePath) throws IOException {

        path = filePath;

        //fills ArrayList with file content line by line
        try {
            BufferedReader in = new BufferedReader(new FileReader(path));
            String str;
            while ((str = in.readLine()) != null) {
                fileContent.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        fileLength = fileContent.size() - 1;
    }


    public int getFileLength(){
        return fileLength-1;
    }


    public String getPath(){
        return path;
    }

    public List<String> getFileContent(){
        return fileContent;
    }

    public void remove(int z){
        fileContent.remove(z);
    }


    //Testing Purposes
    public void printer(){
        for (int i = 1; i <= fileLength-1; i++) {
            System.out.println(i+": "+fileContent.get(i));
        }


    }

}
