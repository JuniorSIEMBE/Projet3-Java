package org.sid.keyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class KeyBoardReader {

    public static String readString(BufferedReader buffer) throws IOException{
        String result=null;
        //reading data
        result= buffer.readLine();
        //returning result
        return result;   
    }

    public static int readInt(BufferedReader buffer) throws IOException, NumberFormatException{
        String result=null;
        //reading data
        result= buffer.readLine();
        //returning result
        return Integer.parseInt(result);   
    }

    public static float readFloat(BufferedReader buffer)throws IOException, NumberFormatException{
        String result=null;
        //reading data
        result= buffer.readLine();
        //returning result
        return Float.parseFloat(result);
    }

    public static double readDouble(BufferedReader buffer) throws IOException, NumberFormatException{
        String result=null;
        //reading data
        result= buffer.readLine();
        //returning result
        return Double.parseDouble(result);
    }

    public static void main(String[] args) {
        //declaration of the buffer
        BufferedReader buffer;
        //initialisation of the buffer
        buffer= new BufferedReader(new InputStreamReader(System.in));
        String name="";
        System.out.print("Entrez votre nom: ");
        try{
            name= KeyBoardReader.readString(buffer);
            System.out.println("Bonjour "+name);
            System.out.print("Entrez votre année de naissance: ");
            int year= KeyBoardReader.readInt(buffer);
            System.out.println("Vous avez "+(2021-year)+" an(s)");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }catch(NumberFormatException nfe){
            nfe.printStackTrace();
        }
    }
}
