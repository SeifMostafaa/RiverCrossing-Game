package command;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import rivercrosserInterfaces.ICrosser;

public class Animal implements ICrosser{

	private double weight = 0;
	private String animalType;
	private String label;
	
	
	public Animal(String animalType) {
		setAnimalType(animalType);
	}
	

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	
	@Override
	public boolean canSail() {
		return false;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public int getEatingRank() {
		if (animalType == "wolf")
			return 3;
		else if (animalType == "goat")
			return 2;
		else 
			return 0;
	}

	@Override
	public BufferedImage[] getImages() {
		BufferedImage[] images= new BufferedImage[2];
		
		if (animalType.equals("wolf")) {

			try {
				images[0] = ImageIO.read(new File("Wolf.png"));
				images[1] = ImageIO.read(new File("wolfLeft.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		else if (animalType.equals("goat")) {

			try {
				images[0] = ImageIO.read(new File("goatRight.png"));
				images[1] = ImageIO.read(new File("goatLeft.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}
		
		return images;
	}
	
	@Override
	public ICrosser makeCopy(String animalType) {
		return new Animal(animalType);
	}

	@Override
	public void setLabelToBeShown(String label) {
		this.label = label;
		
	}

	@Override
	public String getLabelToBeShown() {
		return label;
	}



    

}
