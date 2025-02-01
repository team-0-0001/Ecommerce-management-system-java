
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package exshopping;

import exshopping.view.LoginForm;
import java.awt.Font;
import javax.swing.SwingUtilities;
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
		try {
			Font universalFont = new Font("Iosevka NFM ExtraLight", Font.BOLD, 31);

			// More specific component keys
			String[] componentTypes = {
				".font",
				"Button.font",
				"ToggleButton.font",
				"RadioButton.font",
				"CheckBox.font",
				"ColorChooser.font",
				"ComboBox.font",
				"Label.font",
				"List.font",
				"MenuBar.font",
				"MenuItem.font",
				"RadioButtonMenuItem.font",
				"CheckBoxMenuItem.font",
				"Menu.font",
				"PopupMenu.font",
				"OptionPane.font",
				"Panel.font",
				"ProgressBar.font",
				"ScrollPane.font",
				"Viewport.font",
				"TabbedPane.font",
				"TableHeader.font",
				"TextField.font",
				"PasswordField.font",
				"TextArea.font",
				"TextPane.font",
				"EditorPane.font",
				"TitledBorder.font",
				"ToolBar.font",
				"ToolTip.font",
				"Tree.font"
			};

			// Apply the font to all components
			for (String component : componentTypes) {
				UIManager.put(component, universalFont);
			}

			// Now create and show the GUI
			SwingUtilities.invokeLater(() -> {
				LoginForm main = new LoginForm();
				main.setVisible(true);
			});

		} catch (Exception ex) {
			System.err.println("Failed to initialize LaF: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
}

