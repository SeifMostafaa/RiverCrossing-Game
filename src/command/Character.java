package command;

public class Character {
	
    private boolean charcterOn;

    /**
     * this method used to put characters on boat`
     */
    public void charcterOnBoat() {
        charcterOn=true;
    }

    /**
     * this method used to get Character out off boat
     */
    public void charcterOffBoat() {
        charcterOn=false;
    }
}
