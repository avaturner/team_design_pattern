package team_design_pattern;

import java.util.Scanner;

public class ViewCommand{

    private Scanner in;

    public AppendCommand(Document doc){

        in = new Scanner(System.in);
        this.doc = doc;

    }

    public String execute(){

        System.out.println("What do you want to append to the list?");
        String appendString = in.nextLine();
        document.append(appendString);
        return "The line has been appended to the document";
    }
}