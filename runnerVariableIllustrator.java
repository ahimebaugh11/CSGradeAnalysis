import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.*;

public class runnerVariableIllustrator {


    public static void main(String args[]) throws IOException{
        FileInfo x = null;

        try{
        x = new FileInfo("C:\\Users\\drewh\\Desktop\\Projects\\IntelliJ\\Side Projects\\variableIllustrator\\src\\testerVarIllus.java");
        } catch (Exception e) {
            e.printStackTrace();
        }



        InitStates y = new InitStates(x);
        y.removeComments();


        //tests InitState Methods
        System.out.println("");
        for (int i = 0; i < y.getInitContentsLength(); i++) {
            System.out.println(y.getInitLineNum(i)+": "+y.getInitLineContents(i));
        }



//tests FileInfo Methods
//        x.printer();
//        System.out.println("");
//        System.out.println("");
//        System.out.println("Length: "+x.getFileLength()+ " Lines");
//        System.out.println("Path: "+x.getPath());

    }
}

