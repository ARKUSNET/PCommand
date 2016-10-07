package PatternCommand.Client;

import PatternCommand.Command;
import PatternCommand.Helpers.Helper;

/**
 * Created by a.kuspakov on 07.10.2016.
 */
public class CeilingFanLowCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    @Override
    public void undo() {
        Helper helper = Helper.getInstance();
        helper.setSpeedCeiling(ceilingFan, prevSpeed);
    }
}