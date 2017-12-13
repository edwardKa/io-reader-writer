package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClassicalExample {


    public static void main(String[] args) {

        String fileName = "C:\\Users\\Edward\\Desktop\\buffered\\file.txt";
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try {
            String content = "Эта строка будет записана в файл";
            fileWriter = new FileWriter(fileName, Boolean.TRUE);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
            System.out.println("Готова");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
