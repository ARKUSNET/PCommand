package PatternCommand;

/**
 * Created by a.kuspakov on 07.10.2016.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
           for(int i = 0; i < 7; i++){
               onCommands[i] = noCommand;
                offCommands[i] = noCommand;
            }
            undoCommand = noCommand;
    }

    public void setCommands(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    public String toString(){
        String str = "-";
        String result = "";
        System.out.println(new String(new char[7]).replace("\0", str) + "Remote Control" + new String(new char[7]).replace("\0", str));
        for (int i = 0; i < onCommands.length; i++){
            result += "[slot " + i + "]" + onCommands[i] + "\t" + offCommands[i] + "\n";
            if (i == 6) result =  result + "[undo] " + undoCommand;
        }
        return result;
    }
}
