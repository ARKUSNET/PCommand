package PatternCommand.Client;

import PatternCommand.Command;

/**
 * Created by a.kuspakov on 07.10.2016.
 */
public class TVOnCommand implements Command {
    private TV tvOn;

    public TVOnCommand(TV tvOn){
        this.tvOn = tvOn;
    }

    @Override
    public void execute() {
        tvOn.on();
    }

    @Override
    public void undo() {
        tvOn.off();
    }
}