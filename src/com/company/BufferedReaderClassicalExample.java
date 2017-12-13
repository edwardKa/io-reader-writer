package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClassicalExample {


    public static void main(String[] args) {

        String FILENAME = "C:\\Users\\Edward\\Desktop\\buffered\\file.txt";
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        try {
            //bufferedReader = new BufferedReader(new FileReader(FILENAME));
            fileReader = new FileReader(FILENAME);
            bufferedReader = new BufferedReader(fileReader);
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();}
        finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

}