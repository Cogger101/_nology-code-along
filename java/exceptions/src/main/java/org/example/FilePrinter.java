package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Prints out the contents of a file!
 */
public class FilePrinter {

    /**
     * The path to the file to print.
     */
    private String filePath;

    /**
     * A {@link List} of lines from the file
     */
    private List<String> fileLines;

    /**
     * Constructor, takes the file to print.
     * @param filePath
     */
    public FilePrinter(String filePath) throws IOException{
        this.filePath = filePath;
        this.fileLines = loadFile();

    }

    /**
     * Get the contents of the file as a {@link List} of Strings.
     * @return
     */
    private List<String> loadFile() throws IOException{
        List<String> lines = new ArrayList<>();
        // uncomment line to start
        try {
            lines = Files.readAllLines(Paths.get(this.filePath));
        }
        catch(NoSuchFileException e){
            System.err.println("No such file: " + e.getFile());
            throw e;
        }catch (IOException e){
            System.err.printf("Error reading file: %s. %s", this.filePath, e.getMessage());
            throw e;
        }
        return lines;
    }


    /**
     * Print out the file to standard out.
     */
    public void printOutFile() {
        printOutFile( false );
    }

    public void printOutFile(boolean includeNumbers) {
        System.out.println("Contents of file: " + filePath);
        int lines = 1;
        for (String line : fileLines) {
            if( includeNumbers ) {
                System.err.print(lines++ + ".");
            }
            System.out.print("\t"+ line + "\n");
        }
    }

}
