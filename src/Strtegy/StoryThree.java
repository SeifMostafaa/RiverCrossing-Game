package Strtegy;

import java.util.ArrayList;

import command.Animal;
import command.Farmers;
import command.Plant;
import rivercrosserInterfaces.ICrosser;
import rivercrosserInterfaces.ICrossingStrategy;

public class StoryThree implements ICrossingStrategy {
	
	

	private static Animal monster1 = new Animal("wolf");
	private static Animal monster2 = new Animal("wolf");
	private static Animal monster3 = new Animal("wolf");

	private static Farmers farmer1 = new Farmers();
	private static Farmers farmer2 = new Farmers();
	private static Farmers farmer3 = new Farmers();



	public static Animal getMonster1() {
		return monster1;
	}

	public static Animal getMonster2() {
		return monster2;
	}

	public static Animal getMonster3() {
		return monster3;
	}

	public static Farmers getFarmer1() {
		return farmer1;
	}

	public static Farmers getFarmer2() {
		return farmer2;
	}

	public static Farmers getFarmer3() {
		return farmer3;
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
		


		
		leftbank.add(monster1);
		leftbank.add(monster2);
		leftbank.add(monster3);
		leftbank.add(farmer1);
		leftbank.add(farmer2);
		leftbank.add(farmer3);

		
		return leftbank;
	}

	@Override
	public String[] getInstructions() {
		String[] instructions = new String[5];
		
		instructions[0] = new String("Welcome to our game");
		
		instructions[1] = new String("if there is one monster with one farmer, the farmer will be eaten");

		instructions[2] = new String("if there's more than 1 farmer with the monsters, no one will be eaten");

		instructions[3] = new String("you can sail the boat only by farmer or maximum 2 charachters on the raft");

		
		return instructions;
	}


}
