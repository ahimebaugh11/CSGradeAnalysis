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
    private int initContentsLength;

    public InitStates(FileInfo x) {

        tempFileContents = x.getFileContent();
        
        //tests if a given line is an init statement, runs through
        //every line in the passed program
        for (int i = 0; i < x.getFileLength(); i++) {
            tempLine = tempFileContents.get(i);
            System.out.println("****"+tempLine+"****");
            if(tempLine.contains(" int")){
                initLineNum.add(i+1);
                initLineContents.add(tempLine);
            }
            else if(tempLine.contains("\tint ")) {
                initLineNum.add(i+1);
                initLineContents.add(tempLine);
            }
            else if(tempLine.contains("String ")) {
                initLineNum.add(i+1);
                initLineContents.add(tempLine);
            }
            else if(tempLine.contains("double ")){
                initLineNum.add(i+1);
                initLineContents.add(tempLine);
            }
            else if(tempLine.contains("float ")){
                initLineNum.add(i+1);
                initLineContents.add(tempLine);
            }
            else if(tempLine.contains(" long ")){
                initLineNum.add(i+1);
                initLineContents.add(tempLine);
            }
            else if(tempLine.contains("\tlong ")){
                initLineNum.add(i+1);
                initLineContents.add(tempLine);
            }
            else if(tempLine.contains("char ")){
                initLineNum.add(i+1);
                initLineContents.add(tempLine);
            }
            else if(tempLine.contains("short ")){
                initLineNum.add(i+1);
                initLineContents.add(tempLine);
            }
            else if(tempLine.contains("boolean ")){
                initLineNum.add(i+1);
                initLineContents.add(tempLine);
            }

        }
        initContentsLength = initLineContents.size();
    }
    public int getInitContentsLength(){
        return initContentsLength;
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

    public void removeComments(){
        String tempLine;

        for (int i = 0; i < initContentsLength; i++) {
            tempLine = initLineContents.get(i);

            if (initContentsLength>i) {

                if (tempLine.contains("//")) {
                    initLineContents.remove(i);
                    initLineNum.remove(i);
                    initContentsLength--;
                }
                else if (tempLine.contains("*")) {
                    initLineContents.remove(i);
                    initLineNum.remove(i);
                    initContentsLength--;
                }
                else if (tempLine.contains(" *")) {
                    initLineContents.remove(i);
                    initLineNum.remove(i);
                    initContentsLength--;
                }
                else if (tempLine.contains(" * ")) {
                    initLineContents.remove(i);
                    initLineNum.remove(i);
                    initContentsLength--;
                }
                else if (tempLine.contains("/*")) {
                    initLineContents.remove(i);
                    initLineNum.remove(i);
                    initContentsLength--;
                }
                else if (tempLine.contains("\t*")) {
                    initLineContents.remove(i);
                    initLineNum.remove(i);
                    initContentsLength--;
                }

            }
            else
                break;

        }

    }





}