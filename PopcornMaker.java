package popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		Popcorn popcorn = new Popcorn(JOptionPane.showInputDialog("Flavor of the popcorn:"));
		String time = JOptionPane.showInputDialog("CookTime: (Enter a number)");
		int T = Integer.parseInt(time);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		microwave.setTime(T);
		microwave.startMicrowave();
	}
}
