package Characters;

import java.awt.image.BufferedImage;

import rivercrosserInterfaces.ICrosser;

public class Carnivorous implements ICrosser{

	@Override
	public boolean canSail() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEatingRank() {
		// TODO Auto-generated method stub
		return 0;
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