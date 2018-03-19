import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.*;

public class InitState {

    private String tempLine;
    private List<String> tempFileContent = new ArrayList<String>();
    private int initLineNum;

    private String initString1 = "int ";
    private String initString2 = "String ";
    private String initString3 = "double ";
    private String initString4 = "float ";
    private String initString5 = "long ";
    private String initString6 = "char ";
    private String initString7 = "short ";




    public InitState(FileInfo x) {
        tempFileContent = x.getFileContent();


        for (int i = 1; i < x.getFileLength() ; i++) {
            tempLine = tempFileContent.get(i);
            if(tempLine.toLowerCase().contains(initString1.toLowerCase())) {
                initLineNum = i;
                break;
            }
            else if(tempLine.toLowerCase().contains(initString2.toLowerCase())){
                initLineNum = i;
                break;
            }
            else if(tempLine.toLowerCase().contains(initString3.toLowerCase())){
                initLineNum = i;
                break;
            }
            else if(tempLine.toLowerCase().contains(initString4.toLowerCase())){
                initLineNum = i;
                break;
            }
            else if(tempLine.toLowerCase().contains(initString5.toLowerCase())){
                initLineNum = i;
                break;
            }
            else if(tempLine.toLowerCase().contains(initString6.toLowerCase())){
                initLineNum = i;
                break;
            }
            else if(tempLine.toLowerCase().contains(initString7.toLowerCase())){
                initLineNum = i;
                break;
            }
        }
    }
    public int getInitLineNum(){
        return initLineNum;
    }
    public String getLineContents(){
        return tempLine;
    }





}