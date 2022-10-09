package team_design_pattern;

import java.util.Scanner;

public class WriteCommand {

    private Scanner in;

    public WriteCommand(Document doc){
        in = new Scanner(System.in);
    }

    public String execute(){
        return "";
    }
}
