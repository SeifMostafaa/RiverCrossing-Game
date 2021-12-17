package commandDesignPattern;

public class Char {
	public int num=0;
	public void charOn() {
		System.out.println("Char is on boat");
		setCurrentNumberOfChars(+1);
	}
	
	private void setCurrentNumberOfChars(int num1) {
		num=num+num1;
		System.out.println("Number of charachters : "+num );
	}

	public void charOff() {
		setCurrentNumberOfChars(-1);
		System.out.println("character is out from boat");
	}
}
