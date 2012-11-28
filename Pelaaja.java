package Muistipeli;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class normi implements ActionListener{
	public void actionPerformed(ActionEvent event){
		
		JFrame ikkuna = new JFrame();
		ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ikkuna.setContentPane(new Muistipeli());
		ikkuna.setSize(600, 600);

		ikkuna.setVisible(true);
		
		
	}
	
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
					greenNum++;
					napit.setIcon(green);
					napit.setContentAreaFilled(false);
				}
			if(randomi == 1 && busterNum < 2){
				busterNum++;
				napit.setIcon(busters);
				
			}
			if(randomi == 2 && americaNum < 2){
				americaNum++;
				napit.setIcon(america);
				
			}
			if(randomi==3 && flashNum < 2) {
				flashNum++;
				napit.setIcon(flash);
				
			}
			if(randomi == 4 && ironmanNum < 2){
				ironmanNum++;
				napit.setIcon(ironman);
				
			}
			if(randomi == 5 && spawnNum < 2){
				spawnNum++;
				napit.setIcon(spawn);
				
			}
			

//	}

}
}
