package Strtegy;

import java.awt.List;
import command.*;

import java.util.ArrayList;

import command.Farmers;
import rivercrosserInterfaces.ICrosser;
import rivercrosserInterfaces.ICrossingStrategy;
import command.Farmers;

public class StoryTwo implements ICrossingStrategy{


	
	private static Farmers farmer40 = new Farmers();
	private static Farmers farmer60 = new Farmers();
	private static Farmers farmer80 = new Farmers();
	private static Farmers farmer90 = new Farmers();
	
	private static Animal wolf = new Animal("wolf");
	
	
	
	@Override
	public ArrayList<ICrosser> getInitialCrossers() {
		ArrayList<ICrosser> leftBank = new ArrayList<ICrosser>();
		
		farmer40.setWeight(40);
		farmer60.setWeight(60);
		farmer80.setWeight(80);
		farmer90.setWeight(90);
		wolf.setWeight(20);
		
		leftBank.add(farmer40);
		leftBank.add(farmer60);
		leftBank.add(farmer80);
		leftBank.add(farmer90);
		leftBank.add(wolf);
		
		return leftBank;
	
	}

	public static Farmers getFarmer40() {
		return farmer40;
	}



	public static Farmers getFarmer60() {
		return farmer60;
	}


	public static Farmers getFarmer80() {
		return farmer80;
	}


	public static Farmers getFarmer90() {
		return farmer90;
	}

	
	public static Animal getWolf() {
		return wolf;
	}


	@Override
	public String[] getInstructions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValid(ArrayList<ICrosser> rightBankCrossers, ArrayList<ICrosser> leftBankCrossers,
			ArrayList<ICrosser> boatRiders) {
		// TODO Auto-generated method stub
		return false;
	}

}
