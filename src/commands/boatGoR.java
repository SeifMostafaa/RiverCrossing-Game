package commands;

import commandDesignPattern.Boat;

public class boatGoR implements Command{
	private Boat boat;
	public boatGoR(Boat boat) {
		this.boat = boat;
	}
	
	@Override
	public void execute() {
		boat.moveRight();	
	}
	
	@Override
	public void undo() {
			boat.moveLeft();

	}

}
