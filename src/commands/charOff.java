package commands;

import commandDesignPattern.Char;

public class charOff implements Command{
	private Char chars;
	public charOff(Char chars) {
		this.chars = chars;
	}
	@Override
	public void execute() {
		chars.charOff();
	}
	@Override
	public void undo() {
		chars.charOn();
	}

}
