package PatternCommand.Client;

import PatternCommand.Command;

/**
 * Created by a.kuspakov on 07.10.2016.
 */
public class StereoOnCommand  implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}