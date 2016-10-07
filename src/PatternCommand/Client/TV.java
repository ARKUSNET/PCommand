package PatternCommand.Client;

/**
 * Created by a.kuspakov on 07.10.2016.
 */
public class TV {
    private String nameExecutor;

    public TV(String nameExecutor){
        this.nameExecutor = nameExecutor;
    }

    public void on() {
        System.out.println("PatternCommand.Client.TV on by " + nameExecutor);
    }

    public void undo() {
        System.out.println("PatternCommand.Client.TV undo by " + nameExecutor);
    }

    public void off() {
        System.out.println("PatternCommand.Client.TV off by " + nameExecutor);
    }
}
