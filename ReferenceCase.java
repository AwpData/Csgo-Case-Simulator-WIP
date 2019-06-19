public class ReferenceCase {
	protected int white, lightblue, blue, purple, pink, red, gold;
	static protected int totalwhite = 0, totallightblue = 0, totalblue = 0, totalpurple = 0, totalpink = 0, totalred = 0, totalgold = 0, totalcreditswon = 0;

	public ReferenceCase() {
		this.white = 0;
		this.lightblue = 0;
		this.blue = 0;
		this.purple = 0;
		this.pink = 0;
		this.red = 0;
		this.gold = 0;
	}

	public static void getTotalWinnings() {
		System.out.println("Total Winnings this session:\n"); // Set # of new skins and # of duplicate skins found (based in text file) later
		System.out.println("White (Consumer Grade): " + totalwhite);
		System.out.println("LightBlue (Industrial Grade): " + totallightblue);
		System.out.println("Blue (Mil-Spec): " + totalblue);
		System.out.println("Purple (Restricted): " + totalpurple);
		System.out.println("Pink (Classified): " + totalpink);
		System.out.println("Red (Covert): " + totalred);
		System.out.println("Gold (Exceedingly Rare): " + totalgold);
		System.out.println("Credits: " + totalcreditswon);
	}

	public int getWhite() {
		return white;
	}

	public int getLightBlue() {
		return lightblue;
	}

	public int getBlue() {
		return blue;
	}

	public int getPurple() {
		return purple;
	}

	public int getPink() {
		return pink;
	}

	public int getRed() {
		return red;
	}

	public int getGold() {
		return gold;
	}
}
