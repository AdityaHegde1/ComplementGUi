package pack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel MainPanel = new JPanel();
	static JButton button1 = new JButton();
	static JButton button2 = new JButton();
	static int n;
	static String Complement1;
	static String Complement2;
	static String Complement3;

	public static void main(String[] args) {
		Complement1 = "You're so smart";
		Complement2 = "You're so nice";
		Complement3 = "You're so kind";

		frame.add(MainPanel);
		MainPanel.add(button1);
		MainPanel.add(button2);
		frame.setVisible(true);
		frame.pack();

	}

	public static void Run1() {
		Random rand = new Random();
		System.out.println(n);
		int n = rand.nextInt(3) + 0;
		if (n == 1) {
			button2.setText(Complement1);

		} else if (n == 2) {
			button2.setText(Complement2);

		} else if (n == 3) {
			button2.setText(Complement3);

		}
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button5 = (JButton) e.getSource();
		// TODO Auto-generated method stub
		if (button5 == button1) {

			Gui.Run1();
		}
	}

}
