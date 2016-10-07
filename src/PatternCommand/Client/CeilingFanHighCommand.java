package PatternCommand.Client;

import PatternCommand.Command;
import PatternCommand.Helpers.Helper;

/**
 * Created by a.kuspakov on 07.10.2016.
 */
public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.hidh();
    }

    @Override
    public void undo() {
        Helper helper = Helper.getInstance();
        helper.setSpeedCeiling(ceilingFan, prevSpeed);
    }
}
