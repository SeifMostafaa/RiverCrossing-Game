package commandDesignPattern;

import commands.boatGoR;
import commands.boatGoL;
import commands.charOff;
import commands.charOn;


public class Main {

	public static void main(String[] args) {
	RemoteControl remoteControl = new RemoteControl();	
	Boat boat = new Boat();
	boatGoR boatRight=new boatGoR(boat);
	boatGoL boatLeft=new boatGoL(boat);
		
	remoteControl.setOnCommand(0, boatRight);
	remoteControl.setOffCommand(0,boatLeft );
		
	remoteControl.pushOn(0);
	remoteControl.pushOff(0);
	remoteControl.undo();

	Char chars = new Char();
	charOn charsOn = new charOn(chars);
	charOff charsOff = new charOff(chars);		
	remoteControl.setOffCommand(1, charsOff);
	remoteControl.setOnCommand(1, charsOn);
		
	remoteControl.pushOn(1);
	remoteControl.pushOff(1);
	remoteControl.undo();
		
	remoteControl.pushOn(4);
	remoteControl.pushOff(4);
	}

}
