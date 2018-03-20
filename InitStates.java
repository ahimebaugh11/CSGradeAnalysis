import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.*;

public class InitStates {

    //used for creating InitStates object
    private String tempLine;
    private List<String> tempFileContents = new ArrayList<String>();

    //accessor methods present for these and their individual values
    private List<String> initLineContents = new ArrayList<String>();
    private List<Integer> initLineNum = new ArrayList<Integer>();

    //used for testing to see if it's an init statement
    private String initString1 = "int ";
    private String initString2 = "String ";
    private String initString3 = "double ";
    private String initString4 = "float ";
    private String initString5 = "long ";
    private String initString6 = "char ";
    private String initString7 = "short ";




    public InitStates(FileInfo x) {

        tempFileContents = x.getFileContent();


        //tests if a given line is an init statement, runs through
        //every line in the passed program
        for (int i = 0; i < x.getFileLength()-1 ; i++) {
            tempLine = tempFileContents.get(i);
            if(tempLine.toLowerCase().contains(initString1.toLowerCase())) {
                initLineNum.add(i+1);
                initLineContents.add(tempLine);
            }
            else if(tempLine.toLowerCase().contains(initString2.toLowerCase())){
                initLineNum.add(i+1);
                initLineContents.add(tempLine);

            }
            else if(tempLine.toLowerCase().contains(initString3.toLowerCase())){
                initLineNum.add(i+1);
                initLineContents.add(tempLine);

            }
            else if(tempLine.toLowerCase().contains(initString4.toLowerCase())){
                initLineNum.add(i+1);
                initLineContents.add(tempLine);

            }
            else if(tempLine.toLowerCase().contains(initString5.toLowerCase())){
                initLineNum.add(i+1);
                initLineContents.add(tempLine);

            }
            else if(tempLine.toLowerCase().contains(initString6.toLowerCase())){
                initLineNum.add(i+1);
                initLineContents.add(tempLine);

            }
            else if(tempLine.toLowerCase().contains(initString7.toLowerCase())){
                initLineNum.add(i+1);
                initLineContents.add(tempLine);

            }
        }
    }

    public List<Integer> getInitLineNumArr(){
        return initLineNum;
    }

    public int getInitLineNum(int x){
        return initLineNum.get(x);
    }

    public List<String> getLineContentsArr(){
        return initLineContents;
    }

    public String getInitLineContents(int x){
        return initLineContents.get(x);
    }





}