package PatternCommand.Client;

/**
 * Created by a.kuspakov on 07.10.2016.
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location){
        this.location = location;
        speed = OFF;
    }

    public void hidh(){
        speed = HIGH;
        System.out.println("High speed.");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println("Medium speed.");
    }

    public void low(){
        speed = LOW;
        System.out.println("Low speed.");
    }

    public void off(){
        speed = OFF;
        System.out.println("Off speed.");
    }

    public int getSpeed(){
        return speed;
    }
}
