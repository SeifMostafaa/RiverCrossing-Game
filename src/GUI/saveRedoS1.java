package GUI;

import java.awt.Rectangle;

public class saveRedoS1 {
	private  Rectangle farmerRight;
	private  Rectangle farmerLeft;
	private  Rectangle wolfRight;
	private  Rectangle wolfLeft;
	private  Rectangle goatRight;
	private  Rectangle goatLeft;
	private  Rectangle plantRight;
	private  Rectangle plantLeft;
	private  Rectangle raft;
	private  boolean farmerRightBoolean;
	private  boolean farmerLeftBoolean;
	private  boolean wolfRightBoolean;
	private  boolean wolfLeftBoolean;
	private  boolean goatRightBoolean;
	private  boolean goatLeftBoolean;
	private  boolean plantRightBoolean;
	private  boolean plantLeftBoolean;
	public void setRaftData(Rectangle raft) {
		this.raft=raft;
	}
	public void setFarmerData(Rectangle farmerRight,Rectangle farmerLeft,boolean farmerRightBoolean,boolean farmerLeftBoolean) {
		this.farmerRight=farmerRight;
		this.farmerLeft=farmerLeft;
		this.farmerRightBoolean=farmerRightBoolean;
		this.farmerLeftBoolean=farmerLeftBoolean;
	}
	public void setGoatData(Rectangle goatRight,Rectangle goatLeft,boolean goatRightBoolean,boolean goatLeftBoolean) {
		this.goatRight=goatRight;
		this.goatLeft=goatLeft;
		this.goatRightBoolean=goatRightBoolean;
		this.goatLeftBoolean=goatLeftBoolean;
	}
	public void setWolfData(Rectangle wolfRight,Rectangle wolfLeft,boolean wolfRightBoolean,boolean wolfLeftBoolean) {
		this.wolfRight=wolfRight;
		this.wolfLeft=wolfLeft;
		this.wolfRightBoolean=wolfRightBoolean;
		this.wolfLeftBoolean=wolfLeftBoolean;
	}
	public void setPlantData(Rectangle plantRight,Rectangle plantLeft,boolean plantRightBoolean,boolean plantLeftBoolean) {
		this.plantRight=plantRight;
		this.plantLeft=plantLeft;
		this.plantRightBoolean=plantRightBoolean;
		this.plantLeftBoolean=plantLeftBoolean;
	}
	public Rectangle getFarmerRight() {
		return farmerRight;
	}
	public Rectangle getFarmerLeft() {
		return farmerLeft;
	}
	public Rectangle getGoatRight() {
		return goatRight;
	}
	public Rectangle getGoatLeft() {
		return goatLeft;
	}
	public Rectangle getWolfRigh() {
		return wolfRight;
	}
	public Rectangle getWolfLeft() {
		return wolfLeft;
	}
	public Rectangle getPlantRight() {
		return plantRight;
	}
	public Rectangle gePlantLeft() {
		return plantLeft;
	}
	public Rectangle getRaft() {
		return raft;
	}
	public boolean getFarmerRightBool() {
		return farmerRightBoolean;
	}
	public boolean getFarmerLeftBool() {
		return farmerLeftBoolean;
	}
	public boolean getGoatRightBool() {
		return goatRightBoolean;
	}
	public boolean getGoatLeftBool() {
		return goatLeftBoolean;
	}
	public boolean getWolfRightBool() {
		return wolfRightBoolean;
	}
	public boolean getWolfLeftBool() {
		return wolfLeftBoolean;
	}
	public boolean getPlantRightBool() {
		return plantRightBoolean;
	}
	public boolean getPlantLeftBool() {
		return plantLeftBoolean;
	}
}
