package Controller;

import java.awt.List;
import java.util.ArrayList;

import rivercrosserInterfaces.ICrosser;
import rivercrosserInterfaces.ICrossingStrategy;
import rivercrosserInterfaces.IRiverCrossingController;

public class Controller implements IRiverCrossingController {

	@Override
	public void newGame(ICrossingStrategy gameStrategy) {
		// TODO Auto-generated method stub
		gameStrategy.getInitialCrossers();
	}

	@Override
	public void resetGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] getInstructions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ICrosser> getCrossersOnRightBank() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ICrosser> getCrossersOnLeftBank() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBoatOnTheLeftBank() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getNumberOfSails() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addUndo() {
		// TODO Auto-generated method stub
	}

	@Override
	public void addRedo() {
		// TODO Auto-generated method stub
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveGame() {
		// TODO Auto-generated method stub
	}

	@Override
	public void loadGame() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean canMove(ArrayList<ICrosser> crossers, boolean fromLeftToRightBank) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void doMove(ArrayList<ICrosser> crossers, boolean fromLeftToRightBank) {
		// TODO Auto-generated method stub
	}

	@Override
	public ArrayList<ArrayList<ICrosser>> solveGame() {
		// TODO Auto-generated method stub		
		return null;
	}

}
