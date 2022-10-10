package team_design_pattern;

public class SaveCommand{

    public SaveCommand(Document doc){

        this.doc = doc;
    }

    public String execute(){

        return Document.save();
    }
}