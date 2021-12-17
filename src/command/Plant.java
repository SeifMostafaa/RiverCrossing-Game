package command;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import rivercrosserInterfaces.ICrosser;

public class Plant implements ICrosser{

	private String label;

	@Override
	public boolean canSail() {
		return false;
	}

	@Override
	public double getWeight() {
		return 0;
	}

	@Override
	public int getEatingRank() {
		return 1;
	}

	@Override
	public BufferedImage[] getImages() {
		
		BufferedImage[] images= new BufferedImage[2];
		
		try {
			images[0] = ImageIO.read(new File("planet.png"));
			images[1] = ImageIO.read(new File("planet.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return images;
	}

	@Override
	public ICrosser makeCopy(String animalType) {
		return new Plant();
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
