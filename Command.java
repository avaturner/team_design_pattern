package team_design_pattern;

import org.w3c.dom.Document;

public abstract class Command {
    
    protected Document document;

    public Command(Document document) {
        this.document = document;
    }

    public String execute() {
        return this.execute();
    }
}
