package Characters;

import java.awt.image.BufferedImage;

import rivercrosserInterfaces.ICrosser;

public class Farmer implements ICrosser {

	private double weight;
	
	
	
	@Override
	public boolean canSail() {
		return true;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public int getEatingRank() {
		return -1;
	}

	@Override
	public BufferedImage[] getImages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLabelToBeShown(String label) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getLabelToBeShown() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICrosser makeCopy(String animalType) {
		// TODO Auto-generated method stub
		return null;
	}

}
