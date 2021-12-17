package command;
import rivercrosserInterfaces.ICrosser;
import rivercrosserInterfaces.ICrossingStrategy;
import rivercrosserInterfaces.IRiverCrossingController;

import java.awt.List;
import java.util.ArrayList;

import Characters.Farmer;
import GUI.ErrorScene;
import Strtegy.StoryTwo;
import UnoRedo.Redo;
import UnoRedo.Undo;
import command.*;
import command.*;
public class Invoker implements IRiverCrossingController {

	ArrayList <ICrosser> rightBankCrossers = new ArrayList <ICrosser>();
	ArrayList <ICrosser> leftBankCrossers = new ArrayList <ICrosser>();
	ArrayList <ICrosser> crossersBoat = new ArrayList <ICrosser>();
	ArrayList <ICrosser> initialCrossers = new ArrayList <ICrosser>();
	
	Undo undo = new Undo();
	Redo redo = new Redo();

	
	
	private static Invoker sing;
	
	public static Invoker newInv() {
		
		if (sing == null)
			sing = new Invoker();
		return sing;
	}
	
	
	
	public boolean isStory1() {
		return Story1;
	}

	public boolean isStory2() {
		return Story2;
	}



	private int numOfSails;
	private boolean fromLeftToRightBank = true;
	
	public boolean isFromLeftToRightBank() {
		return fromLeftToRightBank;
	}

	private boolean Story1 = false;
	private boolean Story2 = false;
	
	
	@Override
	public void newGame(ICrossingStrategy gameStrategy) {
		leftBankCrossers = gameStrategy.getInitialCrossers();
		initialCrossers = gameStrategy.getInitialCrossers();
		
		if (leftBankCrossers.size() == 4) {
			Story1 = true;
			Story2 = false;
		}
		else if (leftBankCrossers.size() == 5) {
			Story1 = false;
			Story2 = true;
		}
		
	}
	
	@Override
	public void resetGame() {
		leftBankCrossers = initialCrossers;
		rightBankCrossers.removeAll(rightBankCrossers);
		leftBankCrossers.removeAll(leftBankCrossers);
		
	}

	@Override
	public String[] getInstructions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ICrosser> getCrossersOnRightBank() {
		return rightBankCrossers;
	}

	@Override
	public ArrayList<ICrosser>  getCrossersOnLeftBank() {
		return leftBankCrossers;
	}
	
	public ArrayList<ICrosser>  getCrossersOnBoat() {
		return crossersBoat;
	}

	@Override
	public boolean isBoatOnTheLeftBank() {
		return  fromLeftToRightBank;
	}

	@Override
	public int getNumberOfSails() {
		return numOfSails;
	}

	@Override
	public boolean canMove(ArrayList<ICrosser> crossers, boolean fromLeftToRightBank) {
		
		int i;
		
		if (Story1) {
			
			for (i = 0; i < crossers.size(); i++) {

				
				if (crossers.get(i).getEatingRank() == -1) {
					
					if ( crossers.size() > 0 && crossers.size() <= 2 ) 
						return true;
					
				}
					
			}
			
		}
		else if (Story2) {
			
			double weight = 0;
			
			for (i = 0; i < crossers.size(); i++) {
				weight = weight + crossers.get(i).getWeight();
			}
			
			if (weight > 100) {
				new ErrorScene().setVisible(true);
			}
			
			if ( weight <= 100 && (crossers.contains(StoryTwo.getFarmer40()) || crossers.contains(StoryTwo.getFarmer60()) || crossers.contains(StoryTwo.getFarmer80()) || crossers.contains(StoryTwo.getFarmer90()) ) ) 
				return true;			
		}
		
		
			return false;
		
	}

	
	public void onBoat(ArrayList<ICrosser> crossers, ICrosser crosser) {
		int i;
	
		crossersBoat.add(crosser);
		
		
		for (i=0; i<crossers.size(); i++)
			if(crossers.get(i).getEatingRank() == crosser.getEatingRank()) {
				crossers.remove(i);
			}
		
				
		}
	
	public void offBoat(ICrosser crosser, ArrayList<ICrosser> crossers) {
		int i;
		
		crossers.add(crosser);
		
		for (i=0; i<crossersBoat.size(); i++)
			if(crossersBoat.get(i).getEatingRank() == crosser.getEatingRank()) {
				crossersBoat.remove(i);
			}
			
				
		}
		
	
	
	@Override
	public void doMove(ArrayList<ICrosser> crossers, boolean fromLeftToRightBank) {
		
		int i;
		
		if (fromLeftToRightBank) {
			for (i=0; i<crossers.size(); ++i) {
				rightBankCrossers.add(crossers.get(i));
			}

			
			crossers.removeAll(crossers);
			this.fromLeftToRightBank = false;

		}
		else{
		
			for (i=0; i<crossers.size(); ++i) {
				leftBankCrossers.add(crossers.get(i));				
				}
			crossers.removeAll(crossers);
			this.fromLeftToRightBank = true;

		}
		

		++numOfSails;
		

		
	}

	@Override
	public void addUndo() {
		
		undo.addUndo(leftBankCrossers, rightBankCrossers, crossersBoat);
			
	}

	@Override
	public void addRedo() {
		redo.addRedo(leftBankCrossers, rightBankCrossers, crossersBoat);

			
	}

	@Override
	public void undo() {
		undo.Undo();
		leftBankCrossers = undo.getLeft();
		rightBankCrossers = undo.getRight();
		crossersBoat = undo.getBoat();
	}

	@Override
	public void redo() {
		redo.Redo();	
		leftBankCrossers = redo.getLeft();
		rightBankCrossers = redo.getRight();
		crossersBoat = redo.getBoat();
	}

	@Override
	public void saveGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadGame() {
		// TODO Auto-generated method stub
		
	}
/*
	@Override
	public ArrayList<ArrayList<ICrosser>> solveGame() {
		// TODO Auto-generated method stub
		return null;
	}
 */

	@Override
	public ArrayList<ArrayList<ICrosser>> solveGame() {
		// TODO Auto-generated method stub
		return null;
	}
}
