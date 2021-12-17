package commands;

public class NullCommand implements Command{

	@Override
	public void execute() {
		//System.out.println("There is no button here");
	}

	@Override
	public void undo() {
		//System.out.println("There is no button here");
	}

}
