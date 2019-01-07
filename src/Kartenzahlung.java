package pizzaAutomat;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Kartenzahlung extends JFrame
{
	
	 public JLabel fehler = new JLabel("");
	 public JLabel pin = new JLabel("Pin eingeben :");
	 public JButton zero = new JButton("0");
	 public JButton eins = new JButton("1");
	 public JButton zwei = new JButton("2");
	 public JButton drei = new JButton("3");
	 public JButton vier = new JButton("4");
	 public JButton fünf = new JButton("5");
	 public JButton sechs= new JButton("6");
	 public JButton sieben= new JButton("7");
	 public JButton acht = new JButton("8");
	 public JButton neun = new JButton("9");
     
	 public JButton bestätigen = new JButton("✅");
	 public JButton zurück = new JButton ("x");
	 public JButton schließen = new JButton("Close");
	 
	 public JTextArea geld_display = new JTextArea();
	 
	 
     public void karte()
     {
    	 	JFrame frm = new JFrame();
			setTitle("Kartenzahlung");
			setSize(352,460);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminate
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // verschwindet löscht laufende Ressource
			setVisible(true);
			repaint();
			
			Container container2 = getContentPane();
			container2.setLayout(null);
			container2.setBackground(Color.BLUE);
			
			
			zero.setBounds(150,400,55,25);
			container2.add(zero);
			
			eins.setBounds(80,365,55,25);
			container2.add(eins);
			zwei.setBounds(150,365,55,25);
			container2.add(zwei);
			drei.setBounds(220,365,55,25);
			container2.add(drei);
			
			vier.setBounds(80,330,55,25);
			container2.add(vier);
			fünf.setBounds(150,330,55,25);
			container2.add(fünf);
			sechs.setBounds(220,330,55,25);
			container2.add(sechs);
			
			sieben.setBounds(80,295,55,25);
			container2.add(sieben);
			acht.setBounds(150,295,55,25);
			container2.add(acht);
			neun.setBounds(220,295,55,25);
			container2.add(neun);
			
			geld_display.setBounds(30,150,285,55);
			container2.add(geld_display);
			
			bestätigen.setBounds(280,365,55,60);
			bestätigen.setBackground(Color.green);
			container2.add(bestätigen);
			zurück.setBounds(280,330,55,25);
			container2.add(zurück);
			
			pin.setBounds(29,90,90,80);
			container2.add(pin);
			
			fehler.setBounds(78,20,220,130);
			fehler.setForeground(Color.RED);
			container2.add(fehler);
			
			schließen.setBounds(230,215,85,25);
			schließen.setVisible(false);
			container2.add(schließen);
			
			Zahlmittel_karte betrag_wert = new Zahlmittel_karte(this);
			zero.addActionListener(betrag_wert);
			eins.addActionListener(betrag_wert);
			zwei.addActionListener(betrag_wert);
			drei.addActionListener(betrag_wert);
			vier.addActionListener(betrag_wert);
			fünf.addActionListener(betrag_wert);
			sechs.addActionListener(betrag_wert);
			sieben.addActionListener(betrag_wert);
			acht.addActionListener(betrag_wert);
			neun.addActionListener(betrag_wert);
			bestätigen.addActionListener(betrag_wert);
			zurück.addActionListener(betrag_wert);
			schließen.addActionListener(betrag_wert);
			
     }
    

}
