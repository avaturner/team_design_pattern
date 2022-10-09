package team_design_pattern;

import javax.swing.text.Document;

public abstract class Command {
    
    protected Document document;

    public Command(Document document) {

    }

    public String execute() {
        return "";
    }
}
