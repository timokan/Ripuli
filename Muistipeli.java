package Muistipeli;

import javax.swing.*;
import java.awt.*;



public class Muistipeli extends JPanel  {
	
	
	
	

	public Muistipeli() {
		
		
		
		//Luodaan pelin interface
		this.setLayout(new GridBagLayout());

		GridBagConstraints rajat = new GridBagConstraints();
		rajat.fill = GridBagConstraints.BOTH;
		rajat.insets = new Insets(5, 5, 5, 5);

		JButton napit[] = new JButton[36];

		JPanel paneeli = new JPanel();
		paneeli.setLayout(new GridLayout(6, 6));

		for (int i = 0; i < napit.length; i++) {
			napit[i] = new JButton();

			paneeli.add(napit[i]);
			napit[i].addActionListener(new kuvat());
			
		}
		
		
		JLabel pisteet = new JLabel("PISTEET:");
		pisteet.setFont(new Font("Serif", Font.BOLD, 20));
		
		
		
		JButton poistu = new JButton("Poistu pelistä");

		poistu.addActionListener(new pois());

		JButton uusi = new JButton("Uusi peli");
		

		rajat.gridx = 4;
		rajat.gridy = 0;
		rajat.gridwidth = 1;
		rajat.gridheight = 1;
		rajat.insets = new Insets(0, 0, 0, 0);
		this.add(pisteet, rajat);

		rajat.gridx = 0;
		rajat.gridy = 0;
		rajat.gridwidth = 6;
		rajat.gridheight = 4;
		rajat.weightx = rajat.weighty = 1.0;
		rajat.insets = new Insets(50, 0, 10, 0);
		this.add(paneeli, rajat);

		rajat.gridx = 3;
		rajat.gridy = 6;
		rajat.gridwidth = 1;
		rajat.gridheight = 1;
		rajat.weightx = rajat.weighty = 0.0;
		rajat.insets = new Insets(0, 200, 10, 0);
		this.add(uusi, rajat);

		rajat.gridx = 4;
		rajat.gridy = 6;
		rajat.gridwidth = 1;
		rajat.gridheight = 1;
		rajat.insets = new Insets(0, 10, 10, 0);
		this.add(poistu, rajat);

	}
	

	//static String[] kuvia ={"green" , "busters"};
	
	

		public static void main(String[] args) {

			new Etusivu();

		}


		
}