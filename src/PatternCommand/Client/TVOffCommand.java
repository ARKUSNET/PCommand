package PatternCommand.Client;

import PatternCommand.Command;

/**
 * Created by a.kuspakov on 07.10.2016.
 */
public class TVOffCommand implements Command {
    private TV tvOn;

    public TVOffCommand(TV tvOn){
        this.tvOn = tvOn;
    }

    @Override
    public void execute() {
        tvOn.off();
    }

    @Override
    public void undo() {
        tvOn.on();
    }
}