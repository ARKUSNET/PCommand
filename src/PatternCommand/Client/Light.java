package PatternCommand.Client;

/**
 * Created by a.kuspakov on 07.10.2016.
 */
public class Light {
    private String nameExecutor;

    public Light(String nameExecutor){
     this.nameExecutor = nameExecutor;
    }

    public void on() {
        System.out.println("PatternCommand.Client.Light on by " + nameExecutor);
    }

    public void undo() {
        System.out.println("PatternCommand.Client.Light undo by " + nameExecutor);
    }

    public void off() {
        System.out.println("PatternCommand.Client.Light off by " + nameExecutor);
    }
}
