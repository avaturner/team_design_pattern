package team_design_pattern;

import org.w3c.dom.Document;
/**
 * @author Mark Shperkin
 * this class constructs the commands
 */
public abstract class Command {
    /**
     * creates a Document and calls it document
     */
    protected Document document;
/**
 * consructs a document
 * @param document takes a document in and assigns it to document
 */
    public Command(Document document) {
        this.document = document;
    }
/**
 * this method calls the commands execute methods
 * @return returns a 
 */
    public String execute() {
        return this.execute();
    }
}
