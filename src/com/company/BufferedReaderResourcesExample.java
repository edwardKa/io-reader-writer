package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderResourcesExample {



    public static void main(String[] args) {

        String fileName = "C:\\Users\\Edward\\Desktop\\buffered\\file.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

            String currentLine;

            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
