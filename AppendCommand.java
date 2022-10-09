package team_design_pattern;

import java.util.Scanner;

public class ViewCommand{

    private Scanner in;

    public AppendCommand(Document doc){

        in = new Scanner(System.in);
    }

    public String execute(){
        return "";
    }
}