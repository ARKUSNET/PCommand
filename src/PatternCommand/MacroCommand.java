package PatternCommand;

/**
 * Created by a.kuspakov on 07.10.2016.
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(int i = 0; i < commands.length; i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i = 0; i < commands.length; i++){
            commands[i].undo();
        }
    }
}
