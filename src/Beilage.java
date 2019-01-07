package pizzaAutomat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

 public class Beilage implements ActionListener 
{	
	Pizza4You pizza_wert; 
	Beilage(Pizza4You pizza_ubergabe) 
	{
		this.pizza_wert = pizza_ubergabe;
	}
	 
	Geldbetrag getmoney;
	Beilage(Geldbetrag money)
	{
		this.getmoney=money;
	}
	 
	public void actionPerformed(ActionEvent beilage1)
	{   		
	  Object object = beilage1.getSource();
	//  pizzaAutomat pizza = pizzaAutomat();
	 
	  
	  if(object == pizza_wert.b1)
	  {
		
		  pizza_wert.b_teig1.setEnabled(true);
		  pizza_wert.b_teig2.setEnabled(true);
		 
	  }
	  if(object == pizza_wert.b_teig1)
	  {
		  pizza_wert.ausgabe_menu.setText("Pizza Teig: Amerikanisch  " + pizza_wert.teig_preis+ "€");
		  pizza_wert.b2.setEnabled(true);
		  pizza_wert.b3.setEnabled(true);
		  pizza_wert.b4.setEnabled(true);
	  }
	  
	  else if (object ==pizza_wert.b_teig2)
		{ 
			
		  pizza_wert.ausgabe_menu.setText("Pizza Teig: Italienisch " + pizza_wert.teig_preis+ "€");
		  pizza_wert.b2.setEnabled(true);
		  pizza_wert.b3.setEnabled(true);
		  pizza_wert.b4.setEnabled(true);
			
		}
		else if(object==pizza_wert.b2)
		{
			
			pizza_wert.ausgabe_menu.append("\nBeilage: Käse " +pizza_wert.kase_preis+" €");
			pizza_wert.auswahl =2;
			pizza_wert.b2.setEnabled(false);
			pizza_wert.b3.setEnabled(false);
			pizza_wert.b4.setEnabled(false);
	
		}
	
		else if(object==pizza_wert.b3)
		{
			
			pizza_wert.ausgabe_menu.append("\nBeilage: Champignos " +pizza_wert.pilz_preis+" €");
			pizza_wert.auswahl =3;
			pizza_wert.b2.setEnabled(false);
			pizza_wert.b3.setEnabled(false);
			pizza_wert.b4.setEnabled(false);
		}
		else if(object==pizza_wert.b4)
		{
	
			pizza_wert.ausgabe_menu.append("\nBeilage: Salami " + pizza_wert.salami_preis+" €");
			pizza_wert.auswahl =4;
			pizza_wert.b2.setEnabled(false);
			pizza_wert.b3.setEnabled(false);
			pizza_wert.b4.setEnabled(false);
		}
	  
	  
		else if(object==pizza_wert.b_reset)
		{
			pizza_wert.b2.setEnabled(false);
			pizza_wert.b3.setEnabled(false);
			pizza_wert.b4.setEnabled(false);
			pizza_wert.b1.setEnabled(true);
			pizza_wert.b_cash.setEnabled(true);
			pizza_wert.ausgabe_menu.setText("");
			if(pizza_wert.ausgabe_menu.getText().isEmpty())
			{
				pizza_wert.setVisible(false);
			    mainclass main = new mainclass();
				main.main(null);
				
			}
		
		}
		else if(object==pizza_wert.b_cash)
		{
				pizza_wert. b1.setEnabled(false);
				pizza_wert.b_teig1.setEnabled(false);
				pizza_wert.b_teig2.setEnabled(false);
				pizza_wert.b2.setEnabled(false);
				pizza_wert.b3.setEnabled(false);
				pizza_wert.b4.setEnabled(false);
				pizza_wert.b_cash.setEnabled(false);
				
				if(pizza_wert.ausgabe_menu.getText().isEmpty())
				{
					pizza_wert.ausgabe_menu.setText("leere Auswahl..");		
					pizza_wert.b1.setEnabled(true);
					pizza_wert.b_cash.setEnabled(true);
					//pizza_wert.setVisible(false);
					//mainclass main = new mainclass();
					//main.main(null);
					
				}
					 
				else
				{
				// zweite Frame inkludieren
					Kassensystem cash_frm = new Kassensystem();
					cash_frm.Kassensyst();
					cash_frm.txt_bestellung.setEditable(false);
					cash_frm.txt_bestellung.setText("Auswahl: \n");
					cash_frm.txt_bestellung.append(pizza_wert.ausgabe_menu.getText());
					
					cash_frm.txt_bestellung.setFont(new Font("Arial",Font.ITALIC,21));
					cash_frm.txt_bestellung.append("\n---------------------------------------------------------\n\n\n");
					if(pizza_wert.auswahl==2)
					{
						cash_frm.txt_bestellung.append("Gesamtpreis: 9.00 €");
					}
					
					if(pizza_wert.auswahl==3)
					{
						cash_frm.txt_bestellung.append("Gesamtpreis: 10.00 €");
					}
					
					if(pizza_wert.auswahl==4)
					{
						cash_frm.txt_bestellung.append("Gesamtpreis: 11.00 €");
					}
					
					pizza_wert.auswahl=0;
				}
					
				}			
		}
				
			}
			
	
			
		

 

	 
