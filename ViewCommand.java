package team_design_pattern;

import javax.swing.text.Document;

import command.FileManipulator;

public class ViewCommand{

    public ViewCommand(Document doc){
        execute();
    }

    public String execute(){
        return Document.view();
    }
}