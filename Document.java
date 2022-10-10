package team_design_pattern;

import java.util.*;


public class Document {
    private String fileName;
    private ArrayList<String> lines;
    /**
     * Sets the name of document and reads the file
     * @param name is the name of the document
     */
    private Document(String fileName) {
        this.fileName = fileName;
        FileManipulator.readFile(fileName);
    }

    /**
     * Views the document by ...
     */
    public String view() {
        return "Document " + this.filename + " is viewed";
    }

    /**
     * Appends to the document by adding the line in the parameter to the end of the document
     * @param line The new line being appended to the document
     * @return informing the user that the document was appended
     */
    public String append(String line) {
        this.lines.add(line);
        return "Document " + this.filename + " is appended";
    }

    /**
     * Writes to the document by clearing the original document array list, and adding the new line
     * @param line The new line being written to the document
     * @return informing the user that the document was written
     */
    public String write(String line) {
        this.lines = null;
        this.lines.add(line);
        return "Document " + this.filename + " is written";
    }

    /**
     * Saves the document by writing to the file
     * @return Informs the user if the file was able to be saved
     */
    public String save() {
        if (lines != null){
            FileManipulator.writeFile(fileName, lines);
            return "Your file has been saved.";
        }
        else{
            return "Sorry, we cannot save your file at this time.";
        }
    }
}
