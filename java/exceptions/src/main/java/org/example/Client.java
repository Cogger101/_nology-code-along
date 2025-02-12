package org.example;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

/**
 * Client for calling the {@link FilePrinter}.
 */
public class Client {

    public static final String BOH_RHAPS = "bohemian-rhapsody.txt";
    public static final String LIFE_ON_MARS = "life-on-mars.txt";

    public static void main(String[] args){

        try{
            FilePrinter filePrinter = new FilePrinter(BOH_RHAPS);
            filePrinter.printOutFile();
        }catch(NoSuchFileException e){
            System.err.println("File connot be found or read: " + e.getFile());
        }catch (IOException e){
            e.printStackTrace();
        }

//        FilePrinter filePrinter = new FilePrinter(BOH_RHAPS);


    }

}
