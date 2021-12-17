package commands;

import commandDesignPattern.Char;

public class charOn implements Command{
	private Char chars;
	public charOn(Char chars) {
		this.chars = chars;
	}
	@Override
	public void execute() {
		chars.charOn();
	}
	@Override
	public void undo() {
		chars.charOff();
	}

}
