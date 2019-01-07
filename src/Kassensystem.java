package pizzaAutomat;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Kassensystem extends JFrame 
{
	
	public JTextArea txt_bestellung = new JTextArea();
	public JButton  storno = new JButton();
	public JButton  kartenzahlung = new JButton();
	
	/*public JButton  barzahlung = new JButton();
	
	
	public JButton  funf_cent_btn = new JButton("5ct");
	public JButton  zehn_cent_btn = new JButton("10ct");
	public JButton  zwanzig_cent_btn = new JButton("20ct");
	public JButton  funfzig_cent_btn = new JButton("50ct");
	
	public JButton  funf_euro_btn = new JButton("5€");
	public JButton  zehn_euro_btn = new JButton("10€");
	public JButton  zwanzig_euro_btn = new JButton("20€");
	public JButton  funfzig_euro_btn = new JButton("50€");*/
	
	public void Kassensyst()
	{
		JFrame cash_frm = new JFrame();
		Dimension frame2 = new Dimension(541,384);
		Dimension dim2 = Toolkit.getDefaultToolkit().getScreenSize();
		int top2 =(dim2.height-frame2.height)/2;
		int left2 =(dim2.width-frame2.width)/2;
		
		setTitle("Kassensystem Pizza4YOU");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setSize(frame2);
		setLocation(left2,top2);
		
		
		Container contain = getContentPane();  //in Frame Bauelemente inkludieren
		contain.setLayout(null);
		
		setVisible(true);
		contain.setBackground(new Color(137,207,240));
		
		txt_bestellung.setBounds(73,2,400,265);
		txt_bestellung.setBackground(new Color(51-153-255));
		contain.add(txt_bestellung);
		
		storno.setText("Exit");
		storno.setForeground(Color.RED);
		storno.setBounds(435,300,75,40);
		storno.setBackground(Color.DARK_GRAY);
		contain.add(storno);
		
		/*barzahlung.setText("BAR");
		barzahlung.setForeground(Color.YELLOW);
		barzahlung.setBounds(580,340,75,40);
		barzahlung.setBackground(Color.DARK_GRAY);
		contain.add(barzahlung);*/
	    
		kartenzahlung.setText("EC-Karte"); // zb hier Aufgabe 5 E2
		kartenzahlung.setForeground(Color.white);
		kartenzahlung.setBounds(310,300,85,40);
		kartenzahlung.setBackground(Color.DARK_GRAY);
		contain.add(kartenzahlung);
		
		
		
		/*funf_cent_btn.setBackground(Color.yellow);
		
		funf_cent_btn.setBounds(35,30,75, 40);
		contain.add(funf_cent_btn);
		
		zehn_cent_btn.setBackground(Color.yellow);
		zehn_cent_btn.setBounds(155,30,75, 40);
		contain.add(zehn_cent_btn);
		
		zwanzig_cent_btn.setBackground(Color.yellow);
		zwanzig_cent_btn.setBounds(35,95,75, 40);
		contain.add(zwanzig_cent_btn);
		
		funfzig_cent_btn.setBackground(Color.yellow);
		funfzig_cent_btn.setBounds(155,95,75, 40);
		contain.add(funfzig_cent_btn);
		
		//Implementierung Scheine
		funf_euro_btn.setBackground(Color.green);
		funf_euro_btn.setBounds(35,160,75, 40);
		contain.add(funf_euro_btn);
		
		zehn_euro_btn.setBackground(Color.green);
		zehn_euro_btn.setBounds(155,160,75, 40);
		contain.add(zehn_euro_btn);
		
		zwanzig_euro_btn.setBackground(Color.green);
		zwanzig_euro_btn.setBounds(35,225,75, 40);
		contain.add(zwanzig_euro_btn);
		
		funfzig_euro_btn.setBackground(Color.green);
		funfzig_euro_btn.setBounds(155,225,75, 40);
		contain.add(funfzig_euro_btn);
		
		//Button Editenable false setzen
		
		funf_cent_btn.setEnabled(false);
		zehn_cent_btn.setEnabled(false);
		funfzig_cent_btn.setEnabled(false);
		zwanzig_cent_btn.setEnabled(false);
		
		funf_euro_btn.setEnabled(false);
		zehn_euro_btn.setEnabled(false);
		zwanzig_euro_btn.setEnabled(false);
		funfzig_euro_btn.setEnabled(false);*/
	
		
		Geldbetrag betrag = new Geldbetrag(this);
		//barzahlung.addActionListener(betrag);
		kartenzahlung.addActionListener(betrag);
		storno.addActionListener(betrag);
		
		
		
	
	}
	
		
		
	}
	
	


