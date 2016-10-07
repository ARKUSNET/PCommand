package PatternCommand;

/**
 * Created by a.kuspakov on 07.10.2016.
 */
public interface Command {
    public void execute();
    public void undo();
}
