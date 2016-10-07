package PatternCommand.Client;

import PatternCommand.Command;

/**
 * Created by a.kuspakov on 07.10.2016.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
