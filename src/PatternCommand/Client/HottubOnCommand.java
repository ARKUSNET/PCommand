package PatternCommand.Client;

import PatternCommand.Command;

/**
 * Created by a.kuspakov on 07.10.2016.
 */
public class HottubOnCommand implements Command {
    private Hottub hottub;

    public HottubOnCommand(Hottub hottub){
        this.hottub = hottub;
    }

    @Override
    public void execute() {
       hottub.on();
    }

    @Override
    public void undo() {
       hottub.off();
    }
}