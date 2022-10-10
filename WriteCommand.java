package team_design_pattern;

import java.util.Scanner;

public class WriteCommand {

    private Scanner in;

    public WriteCommand(Document doc){
        in = new Scanner(System.in);
        this.doc = doc;
    }

    public String execute(){
        System.out.println("What did you want to write?");
        String writeString = in.nextLine();
        document.write(writeString);
        return "The line was written to the file.";
    }
}
