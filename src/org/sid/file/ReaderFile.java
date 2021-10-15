package org.sid.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ReaderFile {

    public static final int length = 100;

    public static int[][] readFile(BufferedReader buffer) throws IOException{
        String[] result = new String[length];
        int i=0;
        int[][] res = new int[length][length];
        while(buffer.ready()){
            String line = buffer.readLine();    
            result[i] = line;
            i++;   
        }
        for (int j = 0; j < result.length; j++) {
            String [] line = result[i].split(" ");
            for (int k = 0; k < line.length; k++) {
                res[j][k] = Integer.parseInt(line[k]);
            }
        }
        return res;
    }

    public static int[][] WriteFile(FileWriter fileWriter) throws IOException{
        int[][] res = new int[length][length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                res[i][j] = random.nextInt(10);
                fileWriter.write(res[i][j]+" ");
            }
            fileWriter.write("\n");
        }
        return res;
    }

    public static void main(String[] args) {
        /*try {
            BufferedReader buff = new BufferedReader(new FileReader("exemple.txt"));
            /*String[] data = ReaderFile.readFile(buff);
            for (int i = 0; i < data.length; i++) {
                System.out.println("Ligne : "+i+" "+data[i]);   
            }    */        
        /* catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            FileWriter file = new FileWriter("exemple.txt");
            int[][] mat = WriteFile(file);
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
