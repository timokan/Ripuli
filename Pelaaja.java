package Muistipeli;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Pelaaja extends Muistipeli {


class pois implements ActionListener {
	public void actionPerformed(ActionEvent event) {

		System.exit(0);
	}

}

class kuvat implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() instanceof JButton)
			;

		JButton napit = (JButton) event.getSource();

		ImageIcon green = new ImageIcon(getClass().getResource("green.jpg"));
		napit.setIcon(green);

	}

}

	public static void main(String[] args) {

		JFrame ikkuna = new JFrame();
		ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ikkuna.setContentPane(new Muistipeli());
		ikkuna.setSize(600, 600);

		ikkuna.setVisible(true);

	}
}