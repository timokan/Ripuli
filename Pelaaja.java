package Muistipeli;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Pelaaja extends Muistipeli {

}

//Poistu pelist‰ - napin toiminta
class pois implements ActionListener {
	public void actionPerformed(ActionEvent event) {

		System.exit(0);
	}

}

//kuvat luokka
//asetetaan kaikki kuvat ja tehd‰‰n alustava kuvien asetus napeille
class kuvat implements ActionListener {
	
	ImageIcon green = new ImageIcon(getClass().getResource("green.jpg"));
	ImageIcon busters = new ImageIcon(getClass().getResource("busters.jpg"));
	ImageIcon america = new ImageIcon(getClass().getResource("america.jpg"));
	ImageIcon flash = new ImageIcon(getClass().getResource("flash.jpg"));
	ImageIcon ironman = new ImageIcon(getClass().getResource("ironman.jpg"));
	ImageIcon spawn = new ImageIcon(getClass().getResource("spawn.jpg"));
	

	public void actionPerformed(ActionEvent event) {
		
		Random rand = new Random();
		int min = 0;
		int max = 5;
		
			JButton napit = (JButton) event.getSource();
			int peli;
			//alustetaan laskurit kuvien m‰‰r‰lle
			int greenNum = 0;
			int busterNum = 0;
			int americaNum = 0;
			int flashNum = 0;
			int ironmanNum = 0;
			int spawnNum = 0;
			
		//	for(peli =0; peli< 20;peli++){
				
			
				int randomi = rand.nextInt(max-min +1)+min;
				
				if(randomi == 0 && greenNum < 2){
			napit.setIcon(green);
			greenNum++;
			}
			if(randomi == 1 && busterNum < 2){
				napit.setIcon(busters);
				busterNum++;
			}
			if(randomi == 2 && americaNum < 2){
				napit.setIcon(america);
				americaNum++;
			}
			if(randomi==3 && flashNum < 2) {
				napit.setIcon(flash);
				flashNum++;
			}
			if(randomi == 4 && ironmanNum < 2){
				napit.setIcon(ironman);
				ironmanNum++;
			}
			if(randomi == 5 && spawnNum < 2){
				napit.setIcon(spawn);
				spawnNum++;
			}
			

//	}

}
}

