package UnoRedo;

import java.util.ArrayList;
import java.util.Stack;

import rivercrosserInterfaces.ICrosser;

public class Undo {

	private Stack<ArrayList<ICrosser>> undoLeft = new Stack();
	private Stack<ArrayList<ICrosser>> undoRight = new Stack();
	private Stack<ArrayList<ICrosser>> undoBoat = new Stack();


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
	
	public void addUndo(ArrayList<ICrosser> LeftBank, ArrayList<ICrosser> RightBank,  ArrayList<ICrosser> Boat ) {
		undoLeft.add(LeftBank);
		undoRight.add(RightBank);
		undoBoat.add(Boat);
	}
	
	
	public void Undo() {
		ArrayList<ICrosser> temp = new ArrayList<ICrosser>();
		
		if (undoLeft.size()> 0 && undoRight.size() > 0 && undoBoat.size() > 0) {
		temp = undoLeft.pop();
		left = temp;
		
		temp = undoRight.pop();
		right = temp;
		
		temp = undoBoat.pop();
		boat = temp;
		}
	}
	
	
	
}
