import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.*;

public class VariableIllustrator {

    public static void main(String args[]) throws IOException{
        FileInfo x = null;
        try{
        x = new FileInfo("C:\\Users\\drewh\\Desktop\\Projects\\Eclipse Workspace\\groupProject\\src\\groupProject\\wordRandomizer.java");
        } catch (Exception e) {
            e.printStackTrace();
        }

        InitState y = new InitState(x);
        int i = 0;
        //NEED A LIST OF INITSTATE OBJECTS
        do{
            x.remove(i);
            i++;
        }while(x.getFileContent() != null && i<y.getInitLineNum());









//tests InitState Methods
        System.out.println("");
        System.out.println(y.getInitLineNum()+": "+y.getLineContents());



//tests FileInfo Methods
//        x.printer();
//        System.out.println("");
//        System.out.println("");
//        System.out.println("Length: "+x.getFileLength()+ " Lines");
//        System.out.println("Path: "+x.getPath());

    }
}

