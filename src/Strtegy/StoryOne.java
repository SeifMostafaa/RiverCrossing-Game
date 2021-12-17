package Strtegy;

import java.awt.List;
import java.util.ArrayList;

import command.Animal;
import command.Farmers;
import command.Invoker;
import command.Plant;
import rivercrosserInterfaces.ICrosser;
import rivercrosserInterfaces.ICrossingStrategy;

public class StoryOne implements ICrossingStrategy {


	private static Farmers farmer = new Farmers();
	
	private static Animal wolf = new Animal("wolf");

	private static Animal goat = new Animal("goat");
	
	private static Plant plant = new Plant();

	
	public static Farmers getFarmer() {
		return farmer;
	}


	public static Animal getWolf() {
		return wolf;
	}


	public static Animal getGoat() {
		return goat;
	}


	public static Plant getPlant() {
		return plant;
	}



	@Override
	public boolean isValid(ArrayList<ICrosser> rightBankCrossers, ArrayList<ICrosser> leftBankCrossers, ArrayList<ICrosser> boatRiders) {
		/*int i,j;
		
		for (i=0; i<leftBankCrossers.size(); ++i ) {
			if ()
		}*/
		return false;
		
	}

	@Override
	public ArrayList<ICrosser> getInitialCrossers() {
		ArrayList<ICrosser> leftbank = new ArrayList<ICrosser>();
		


		
		leftbank.add(farmer);
		leftbank.add(wolf);
		leftbank.add(goat);
		leftbank.add(plant);
		
		return leftbank;
	}

	@Override
	public String[] getInstructions() {
		String[] instructions = new String[5];
		
		instructions[0] = new String("Welcome to our game");
		
		instructions[1] = new String("The Goat can eat the plant");

		instructions[2] = new String("The Wolf can eat the goat");

		instructions[3] = new String("you can sail the boat only by farmer or maximum 2 charachters on the raft");

		
		return instructions;
	}

}
