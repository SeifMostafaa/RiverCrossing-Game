package commands;

import commandDesignPattern.Boat;

public class boatGoL implements Command{
	private Boat boat;
	public boatGoL(Boat boat) {
		this.boat = boat;
	}
	@Override
	public void execute() {
		boat.moveLeft();
	}
	@Override
	public void undo() {
		boat.moveRight();
	}

}
