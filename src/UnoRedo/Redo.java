package UnoRedo;

import java.util.ArrayList;
import java.util.Stack;

import rivercrosserInterfaces.ICrosser;

public class Redo {

	
	private Stack<ArrayList<ICrosser>> redoLeft = new Stack();
	private Stack<ArrayList<ICrosser>> redoRight = new Stack();
	private Stack<ArrayList<ICrosser>> redoBoat = new Stack();
	
	private ArrayList<ICrosser> left = new ArrayList();
	private ArrayList<ICrosser> right = new ArrayList();
	private ArrayList<ICrosser> boat = new ArrayList();
	
	
	public ArrayList<ICrosser> getLeft() {
		return left;
	}

	public ArrayList<ICrosser> getRight() {
		return right;
	}

	public ArrayList<ICrosser> getBoat() {
		return boat;
	}
	
	
	public void addRedo(ArrayList<ICrosser> LeftBank, ArrayList<ICrosser> RightBank,  ArrayList<ICrosser> Boat ) {
		redoLeft.add(LeftBank);
		redoRight.add(RightBank);
		redoBoat.add(Boat);
	}
	
	
	public void Redo() {
		ArrayList<ICrosser> temp = new ArrayList<ICrosser>();
		
		if (redoLeft.size()> 0 && redoRight.size() > 0 && redoBoat.size() > 0) {

		temp = redoLeft.pop();
		left = temp;
		
		temp = redoRight.pop();
		right = temp;
		
		temp = redoBoat.pop();
		boat = temp;
		}
		
	}
	
	
	

}
