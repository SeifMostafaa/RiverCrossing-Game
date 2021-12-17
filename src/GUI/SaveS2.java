package GUI;

import java.awt.Rectangle;

public class SaveS2 {
	private static Rectangle farmer_40Right;
	private static Rectangle farmer_40Left;
	private static Rectangle wolfRight;
	private static Rectangle wolfLeft;
	private static Rectangle farmer_90Right;
	private static Rectangle farmer_90Left;
	private static Rectangle farmer_80Right;
	private static Rectangle farmer_80Left;
	private static Rectangle farmer_60Right;
	private static Rectangle farmer_60Left;
	private static Rectangle raft;
	private static boolean farmer_40RightBoolean;
	private static boolean farmer_40LeftBoolean;
	private static boolean wolfRightBoolean;
	private static boolean wolfLeftBoolean;
	private static boolean farmer_80RightBoolean;
	private static boolean farmer_80LeftBoolean;
	private static boolean farmer_90RightBoolean;
	private static boolean farmer_90LeftBoolean;
	private static boolean farmer_60RightBoolean;
	private static boolean farmer_60LeftBoolean;
	public void setRaftData(Rectangle raft) {
		this.raft=raft;
	}
	public void setFarmer_40Data(Rectangle farmer_40Right,Rectangle farmer_40Left,boolean farmer_40RightBoolean,boolean farmer_40LeftBoolean) {
		this.farmer_40Right=farmer_40Right;
		this.farmer_40Left=farmer_40Left;
		this.farmer_40RightBoolean=farmer_40RightBoolean;
		this.farmer_40LeftBoolean=farmer_40LeftBoolean;
	}
	public void setFarmer_90Data(Rectangle farmer_90Right,Rectangle farmer_90Left,boolean farmer_90RightBoolean,boolean farmer_90LeftBoolean) {
		this.farmer_90Right=farmer_90Right;
		this.farmer_90Left=farmer_90Left;
		this.farmer_90RightBoolean=farmer_90RightBoolean;
		this.farmer_90LeftBoolean=farmer_90LeftBoolean;
	}
	public void setFarmer_80Data(Rectangle farmer_80Right,Rectangle farmer_80Left,boolean farmer_80RightBoolean,boolean farmer_80LeftBoolean) {
		this.farmer_80Right=farmer_80Right;
		this.farmer_80Left=farmer_80Left;
		this.farmer_80RightBoolean=farmer_80RightBoolean;
		this.farmer_80LeftBoolean=farmer_80LeftBoolean;
	}
	public void setWolfData(Rectangle wolfRight,Rectangle wolfLeft,boolean wolfRightBoolean,boolean wolfLeftBoolean) {
		this.wolfRight=wolfRight;
		this.wolfLeft=wolfLeft;
		this.wolfRightBoolean=wolfRightBoolean;
		this.wolfLeftBoolean=wolfLeftBoolean;
	}
	public void setFarmer_60Data(Rectangle farmer_60Right,Rectangle farmer_60Left,boolean farmer_60RightBoolean,boolean farmer_60LeftBoolean) {
		this.farmer_60Right=farmer_60Right;
		this.farmer_60Left=farmer_60Left;
		this.farmer_60RightBoolean=farmer_60RightBoolean;
		this.farmer_60LeftBoolean=farmer_60LeftBoolean;
	}
	public Rectangle getFarmer_40_40Right() {
		return farmer_40Right;
	}
	public Rectangle getFarmer_40_40Left() {
		return farmer_40Left;
	}
	public Rectangle getFarmer_90Right() {
		return farmer_90Right;
	}
	public Rectangle getFarmer_90Left() {
		return farmer_90Left;
	}
	public Rectangle getWolfRigh() {
		return wolfRight;
	}
	public Rectangle getWolfLeft() {
		return wolfLeft;
	}
	public Rectangle getFarmer_60Right() {
		return farmer_60Right;
	}
	public Rectangle getFarmer_60Left() {
		return farmer_60Left;
	}
	public Rectangle getFarmer_80Right() {
		return farmer_80Right;
	}
	public Rectangle getFarmer_80Left() {
		return farmer_80Left;
	}
	public Rectangle getRaft() {
		return raft;
	}
	public boolean getFarmer_40RightBool() {
		return farmer_40RightBoolean;
	}
	public boolean getFarmer_40LeftBool() {
		return farmer_40LeftBoolean;
	}
	public boolean getFarmer_90RightBool() {
		return farmer_90RightBoolean;
	}
	public boolean getFarmer_90LeftBool() {
		return farmer_90LeftBoolean;
	}
	public boolean getWolfRightBool() {
		return wolfRightBoolean;
	}
	public boolean getWolfLeftBool() {
		return wolfLeftBoolean;
	}
	public boolean getFarmer_60RightBool() {
		return farmer_60RightBoolean;
	}
	public boolean getFarmer_60LeftBool() {
		return farmer_60LeftBoolean;
	}
	public boolean getFarmer_80RightBool() {
		return farmer_80RightBoolean;
	}
	public boolean getFarmer_80LeftBool() {
		return farmer_80LeftBoolean;
	}
}
