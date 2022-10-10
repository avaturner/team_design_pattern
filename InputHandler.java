 
import java.util.HashMap;
 
public class InputHandler{
    private HashMap<String, Command> commands;
 
 
    public InputHandler(Document document){
        commands = new HashMap<String, Command>();
        commands.put("view", new ViewCommand(document));
        commands.put("Append", new AppendCommand(document));
        commands.put("Write", new WriteCommand(document));
        commands.put("Save",new SaveCommand(document));
 
    }
    public void inputEntered(String data){
        if(commands.containsKey(data)){
            commands.get(data).execute();
        }
    }
 
 
}

