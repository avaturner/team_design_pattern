package team_design_pattern;

import java.util.*;


public class Document {
    private String filename;
    private ArrayList<String> lines;
    /**
     * Sets the name of document and prints out that it has been created
     *
     * @param name is the name of the document
     */
    private Document(String name) {
        this.filename = filename;
        System.out.println("Document named " + this.filename + " is created");
    }

    /**
     * Loads document into view
     */
    public void View() {
        System.out.println("Document " + this.filename + " is  into view the document");
    }

    /**
     * it append to the document
     */
    public void append() {
        System.out.println("Document " + this.filename + " is being append");
    }

    /**
     * it writes to the documents
     */
    public void Write() {
        System.out.println("Document " + this.filename + " is writes to the document");
    }

    /**
     * saves the document
     */
    public void Save() {
        System.out.println("Document " + this.filename + " is saved ");
    }
}
