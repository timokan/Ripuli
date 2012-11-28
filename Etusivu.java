package Muistipeli;
import javax.swing.*;
import java.awt.*;

public class Etusivu extends JPanel {

	
	
	public Etusivu(){
		
		
		JFrame etusivu = new JFrame();
		
		etusivu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		etusivu.setTitle("Muistipeli");
		etusivu.setSize(400,400);
		
		etusivu.setLocationRelativeTo(null);
		
		JButton vaikea = new JButton("Vaikea");
		JButton normaali = new JButton("Normaali");
		JButton helppo = new JButton("Helppo");
		JButton Lopeta = new JButton("Poistu Pelistä");
		JButton kaksinpeli = new JButton("Kaksinpeli");
		
		
		Lopeta.addActionListener(new pois());
		normaali.getClass();
		
		JPanel valikko = new JPanel();
		JPanel valikko2 = new JPanel();
		valikko.add(kaksinpeli);
		valikko.add(vaikea);
		valikko.add(normaali);
		valikko.add(helppo);
		valikko2.add(Lopeta);
		
		etusivu.add(valikko, BorderLayout.NORTH);
		etusivu.add(valikko2, BorderLayout.SOUTH);
		etusivu.setVisible(true);
		
		
		normaali.addActionListener(new normi());
		
		
		
		
	}
	
	
	
	
	
}
