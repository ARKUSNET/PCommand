package PatternCommand.Client;

import PatternCommand.Command;
import PatternCommand.Helpers.Helper;

/**
 * Created by a.kuspakov on 07.10.2016.
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        Helper helper = Helper.getInstance();
        helper.setSpeedCeiling(ceilingFan, prevSpeed);
    }
}