package PatternCommand.Helpers;

import PatternCommand.Client.CeilingFan;

/**
 * Created by a.kuspakov on 07.10.2016.
 */
public class Helper {
    private volatile static  Helper helperUniqueInstance;

    private Helper(){}

    public static Helper getInstance(){
        if(helperUniqueInstance == null){
            synchronized (Helper.class){
                helperUniqueInstance = new Helper();
                System.out.println("Helper Unique Instance created");
            }
        }
        return helperUniqueInstance;
    }

    public void setSpeedCeiling(CeilingFan ceilingFan, int prevSpeed){
        switch (prevSpeed) {
            case CeilingFan.HIGH:
                ceilingFan.hidh();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            default:
                ceilingFan.off();
                break;
        }
    }
}
