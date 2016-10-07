package PatternCommand.Client;

/**
 * Created by a.kuspakov on 07.10.2016.
 */
public class Stereo {
    private String nameExecutor;

    public Stereo(String nameExecutor){
        this.nameExecutor = nameExecutor;
    }

    public void on() {
        System.out.println("PatternCommand.Client.Stereo on by " + nameExecutor);
    }

    public void undo() {
        System.out.println("PatternCommand.Client.Stereo undo by " + nameExecutor);
    }

    public void off() {
        System.out.println("PatternCommand.Client.Stereo off by " + nameExecutor);
    }
}
