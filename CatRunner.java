package cat;

import javax.swing.JOptionPane;

public class CatRunner {
	public static void main(String[] args) {
		Cat FluffyPants = new Cat("Mr.FluffyPants");
		FluffyPants.meow();
		FluffyPants.printName();
		for(int i=0;i<9;i++) {
			FluffyPants.kill();
		}
		JOptionPane.showConfirmDialog(null, "le cat is ded");
	}
}
