package commandDesignPattern;

import commands.Command;
import commands.NullCommand;

public class RemoteControl {
	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;
	
	public RemoteControl() {
		onCommands = new Command[5];
		offCommands = new Command[5];
		for (int i = 0; i < offCommands.length; i++) {
			onCommands[i] = new NullCommand();
			offCommands[i] = new NullCommand();
		}
	}
	
	
	public void setOnCommand(int index, Command onCommand) {
		this.onCommands[index] = onCommand;
	}
	
	public void setOffCommand(int index, Command offCommand) {
		this.offCommands[index] = offCommand;
	}
	
	public void pushOn(int index) {
		onCommands[index].execute();
		undoCommand = onCommands[index];
	}
	public void pushOff(int index) {
		offCommands[index].execute();
		undoCommand = offCommands[index];
	}
	
	public void undo() {
		System.out.println("---Undo----");
		undoCommand.undo();
	}
}
