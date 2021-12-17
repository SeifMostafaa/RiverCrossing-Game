package GUI;

import java.awt.Rectangle;

public class SaveS1 {
	private static Rectangle farmerRight;
	private static Rectangle farmerLeft;
	private static Rectangle wolfRight;
	private static Rectangle wolfLeft;
	private static Rectangle goatRight;
	private static Rectangle goatLeft;
	private static Rectangle plantRight;
	private static Rectangle plantLeft;
	private static Rectangle raft;
	private static boolean farmerRightBoolean;
	private static boolean farmerLeftBoolean;
	private static boolean wolfRightBoolean;
	private static boolean wolfLeftBoolean;
	private static boolean goatRightBoolean;
	private static boolean goatLeftBoolean;
	private static boolean plantRightBoolean;
	private static boolean plantLeftBoolean;
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
