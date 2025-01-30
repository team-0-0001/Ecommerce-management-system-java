/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package exshopping;

import exshopping.view.HomeFrame;
import java.awt.Font;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

/**
 *
 * @author sanbid
 */

public class ExShopping {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		 HomeFrame p = new HomeFrame();
		p.setVisible(true);
		try {
			UIDefaults defaults = UIManager.getDefaults();

			Font universalFont = new Font("Arial", Font.PLAIN, 28);

			String[] componentTypes = {
				"Label", "TextField", "Button", "PasswordField",
				"ComboBox", "RadioButton", "CheckBox", "Menu",
				"MenuItem", "Table", "Tree"
			};

			for (String component : componentTypes) {
				defaults.put(component + ".font", universalFont);
			}

		}catch (Exception ex){
			System.err.println("Failed to initialize LaF");
		}
	
}
}

