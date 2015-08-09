import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class eastPanel extends JPanel implements ActionListener{


	private JLabel jl = new JLabel();
	private JButton jbF = new JButton("Font Color");
	private JButton jbP = new JButton("Pen Color");
	private JButton jbS = new JButton("Shape Color");
	private JButton jbC = new JButton("Erase All Color");
	private JButton jbE = new JButton("Eraser");


	public eastPanel(){

		setSize(50, 50);
		setLayout(new GridLayout(10,1));
		System.out.println("Loading East Panel");
		jl.setText("\t" + "\t" + "\t" + "\t" + "\t" + "East Panel");
		add(jl);

		//put options to change: font color, drawing color
		jbF.addActionListener(this);
		jbF.setBackground(centerPanel.getFontColor());
		add(jbF);

		//put options to change: font color, drawing color
		jbP.setBackground(centerPanel.getPenColor());
		jbP.addActionListener(this);
		add(jbP);

		//put options to draw shapes
		jbS.setBackground(centerPanel.getShapeColor());
		jbS.addActionListener(this);
		add(jbS);

		//put options to clear
		jbC.setBackground(Color.black);
		jbC.addActionListener(this);
		add(jbC);

		jbE.setBackground(Color.BLUE);
		jbE.addActionListener(this);
		add(jbE);

	}


	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getActionCommand()=="Font Color"){
			centerPanel.setFontColor(JColorChooser.showDialog(this, "Choose a Font Color", centerPanel.getFontColor()));
			jbF.setForeground(centerPanel.getFontColor());//change the button textcolor to match selected color	
		}
		else if(event.getActionCommand()=="Pen Color"){
			centerPanel.setPenColor(JColorChooser.showDialog(this, "Choose a Pen Color", centerPanel.getPenColor()));
			jbP.setForeground(centerPanel.getPenColor());//change the button text color to match selected color	
		}
		else if(event.getActionCommand()=="Shape Color"){
			centerPanel.setShapeColor(JColorChooser.showDialog(this, "Choose a Shape Color", centerPanel.getShapeColor()));
			jbS.setForeground(centerPanel.getShapeColor());//change the button textcolor to match selected color	
		}
		else if(event.getActionCommand()=="Erase All Color"){
			centerPanel.setShapeColor(Color.black);
			centerPanel.setPenColor(Color.black);
			centerPanel.setFontColor(Color.black);
			jbC.setForeground(Color.black);//change the button's text color to match selected color	
		}
		else if(event.getActionCommand()=="Eraser"){
			centerPanel.setPenColor(Color.white);
			centerPanel.setShapeColor(Color.white);
			jbE.setForeground(Color.black);
		}
		else{
			System.out.println("East Panel actionPerformed else triggered");
		}

	}
}
