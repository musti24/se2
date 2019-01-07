package pizzaAutomat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class pizza_Automat extends JFrame implements ActionListener
{
	JLabel bild,salam,pilz,champ,moz,teig,mehl,txt1,txt2,txt3,txt4;
	JTextField timeout_label;
	Icon icon,icon_salam,i_pilz,i_moz,i_teig,i_amerika,i_italia;
    JButton b1= new JButton("");
    JButton b2= new JButton("");
	JButton b3= new JButton("");
	JButton b4= new JButton("");
	JButton b_cash= new JButton();
	JButton b_teig1 = new JButton();
    JButton b_teig2 = new JButton();
	JButton b_reset = new JButton();
    JPanel p1,p2,p3,p4,p_display,p_zuck,pt1,pt2,pt3,p_cash,pt4,p_auswahl,p_auswahl2,p_reset,timer_panel;
    JTextArea ausgabe_menu;
    Timer tm;
    int i =30;
	double teig_preis =6.99;
	double kase_preis =1.99;
	double pilz_preis =2.49;
	double salami_preis =2.99;
    public pizza_Automat()
	{
		super("Pizza4You");
		p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p1.setBounds(266,143,47,24);
		p1.setOpaque(false);
		add(p1);
		p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p2.setBounds(266,199,47,24);
		p2.setOpaque(false);
		add(p2);
		p3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p3.setBounds(266,253,47,24);
		p3.setOpaque(false);
		add(p3);
		p4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p4.setBounds(266,311,47,24);
		p4.setOpaque(false);
		add(p4);
		
		p_display= new JPanel();
		p_display.setBounds(416,155,128,55);  // Display verwaltung in Process evt...
		add(p_display);
		p_display.setOpaque(false); //Display textausgabe
		ausgabe_menu=new JTextArea();
		ausgabe_menu.setPreferredSize(new Dimension(118,100));
		p_display.add(ausgabe_menu);
		
		
		
		p_cash= new JPanel();
		p_cash.setBounds(347,179,43,20);  // Display verwaltung in Process evt...
		add(p_cash);
		b_cash = new JButton("Kasse");
		b_cash.setPreferredSize(new Dimension(79,20));
		p_cash.setOpaque(false);
		p_cash.add(b_cash);
		
		p_zuck= new JPanel();
		p_zuck.setBounds(125,125,55,30);
		p_zuck.setOpaque(false);
		add(p_zuck);
		
		pt1 = new JPanel();
		pt1.setBounds(122, 179,50, 30);
		pt1.setOpaque(false);
		add(pt1);
		pt2 = new JPanel();
		pt2.setBounds(120, 221,50, 30);
		pt2.setOpaque(false);
		add(pt2);
		pt3 = new JPanel();
		pt3.setBounds(120,271,50, 30);
		pt3.setOpaque(false);
		add(pt3);
		pt4= new JPanel();
		pt4.setBounds(120, 320,50, 30);
		pt4.setOpaque(false);
		add(pt4);
		
		p_reset = new JPanel();
		p_reset.setBounds(501,214,44,20);
		add(p_reset);
		b_reset = new JButton("Zurück");
		b_reset.setPreferredSize(new Dimension(80,20));
		p_reset.setOpaque(false	);
		p_reset.add(b_reset);
		
		timer_panel=new JPanel(); // Timeout Panel folgt zu Timer-Countdown
		timer_panel.setBounds(206,119,113,25);
		timer_panel.setOpaque(false);
		add(timer_panel);
		timeout_label = new JTextField(Integer.toString(i));
		timeout_label.setOpaque(true);
		timeout_label.setPreferredSize(new Dimension(110,25));
		timeout_label.setForeground(Color.GREEN);
		timeout_label.setBackground(Color.GRAY);
		timeout_label.setFont(new Font("Arial", Font.ITALIC, 18));
		timer_panel.add(timeout_label);
		
		
		txt1 = new JLabel("Mehl");
		txt1.setForeground(Color.WHITE);
		pt1.add(txt1);
		txt2 = new JLabel("Getreide");
		txt2.setForeground(Color.WHITE);
		pt2.add(txt2);
		txt3 = new JLabel("Tomaten");
		txt3.setForeground(Color.WHITE);
		pt3.add(txt3);
		txt4 = new JLabel("Gewürze");
		txt4.setForeground(Color.WHITE);
		pt4.add(txt4);
		
		
		
		icon = new ImageIcon(getClass().getResource("test1.png"));
		icon_salam= new ImageIcon(getClass().getResource("Salami.PNG"));
		i_pilz =new ImageIcon(getClass().getResource("Mush.png"));
		i_moz =new ImageIcon(getClass().getResource("moz.png"));
		i_teig =new ImageIcon(getClass().getResource("Teig.png"));
		i_amerika = new ImageIcon(getClass().getResource("amerikanische.PNG"));
		i_italia = new ImageIcon(getClass().getResource("italien.PNG"));
		
		
		p_auswahl= new JPanel();
		p_auswahl.setBounds(385, 135, 120, 55);
		add(p_auswahl);
		b_teig1 = new JButton("",i_amerika);
		b_teig1.setPreferredSize(new Dimension(53,20));
		b_teig1.setEnabled(false);
		p_auswahl.add(b_teig1);
		p_auswahl.setOpaque(false);
		
		p_auswahl2= new JPanel();
		p_auswahl2.setBounds(457, 135, 120, 55);
		add(p_auswahl2);
		b_teig2 = new JButton("",i_italia);
		b_teig2.setPreferredSize(new Dimension(55,20));
		b_teig2.setEnabled(false);
		p_auswahl2.add(b_teig2);
		p_auswahl2.setOpaque(false);
		
		bild = new JLabel(icon);
		add(bild);
		
		salam = new JLabel(icon_salam);
		b4 = new JButton("",icon_salam);
		p4.add(b4);
		pilz =new JLabel(i_pilz);
		b3 = new JButton("",i_pilz);
		p2.add(b3);
		moz =new JLabel(i_moz);
		b2 = new JButton("",i_moz);
		p2.add(b2);
		teig =new JLabel(i_teig);
		b1 = new JButton("",i_teig);
		p2.add(b1);

		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b_teig1.setEnabled(false);
		b_teig2.setEnabled(false);
	
	
		
		
		b1.setPreferredSize(new Dimension(95,18));
		b1.setBackground(Color.WHITE);
		b2.setPreferredSize(new Dimension(110,18));
		b2.setBackground(Color.WHITE);
		b3.setPreferredSize(new Dimension(90,18));
		b3.setBackground(Color.WHITE);
		b4.setPreferredSize(new Dimension(95,18));
		b4.setBackground(Color.WHITE);
		
		
		p1.add(b1);	
		p2.add(b2);
		p3.add(b3);
		p4.add(b4);
		
		//b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
	    b4.addActionListener(this);
	    b_teig1.addActionListener(this);
	    b_teig2.addActionListener(this);
	    b_cash.addActionListener(this);
	    b_reset.addActionListener(this);
	    
	    Thread t = new Thread(new Runnable()
	       {
	           public void run()
	           { 
	        	   while(true)
	        	   {
	        		   timeout_label.setText(String.valueOf(i));
	        	   try {
	        		   	if (i >0)
	        		   		{
	        		   		timeout_label.setText("Timeout :"+ i--);
	        		      
	        		   		}
	        		   	else
	        		   	{
	        		   		b_teig1.setEnabled(false);
	        				b_teig2.setEnabled(false);
	        				b2.setEnabled(false);
	        				b3.setEnabled(false);
	        				b4.setEnabled(false);
	        				System.exit(0);
	        		   	}
	        		   	
	                   Thread.sleep(1000);
	                } catch (Exception e) {
	           
	                }
	        	   
	        	  
	           }
	        	   
	           }
	       });

	b1.addActionListener(new ActionListener() //start pizzaAuswahl(teig)
	        {
	            public void actionPerformed(ActionEvent e)
	            {
	            		            	
	                t.start();
	                b_teig1.setEnabled(true);
	    			b_teig2.setEnabled(true);
	    			
	            }  
	           
	        });
	
	b_reset.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
        		            	
        	b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			b1.setEnabled(true);
			b_cash.setEnabled(true);
			ausgabe_menu.setText("");
			
        }
       
    });
	
	b_cash.addActionListener(new ActionListener() // Auswahl beendet --> stop
    {
        public void actionPerformed(ActionEvent e)
        {
        		            	
            t.stop();
            b1.setEnabled(false);
            b_teig1.setEnabled(false);
			b_teig2.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			b_cash.setEnabled(false);
			
			if(ausgabe_menu.getText().equals(""))
			{
				System.exit(0);
			}
			else
			{
			// zweite Frame inkludieren
				Kassensystem cash_frm = new Kassensystem();
				cash_frm.Kassensyst();
				cash_frm.txt_bestellung.setEditable(false);
				cash_frm.txt_bestellung.setText(ausgabe_menu.getText()+"  "+teig_preis+"€");
				
				cash_frm.txt_bestellung.setFont(new Font("Arial",Font.ITALIC,21));
				cash_frm.txt_bestellung.append("\n---------------------------------------------------------");
				
			}
			
			}
       
    });
	
	

	}
    
    
	public void actionPerformed(ActionEvent e)
	{
		
		Object ob= e.getSource();
		if(ob==b1)
		{ 
			b_teig1.setEnabled(true);
			b_teig2.setEnabled(true);
			
	   }
		
		if(ob==b_teig1)
		{
			
			ausgabe_menu.setText("Teig: Amerikanisch");
			
			b2.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
		}
		else if (ob ==b_teig2)
		{ 
			
			ausgabe_menu.setText("Teig: Italienisch");
			b2.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			
		}
		else if(ob==b2)
		{
			
			ausgabe_menu.append("\nBeilage: Käse");
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
	
		}
	
		else if(ob==b3)
		{
			
			ausgabe_menu.append("\nBeilage: Champignos");
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
		}
		else if(ob==b4)
		{
	
			ausgabe_menu.append("\nBeilage: Salami");
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
		}
		
	}
	}



	
	
	
	
