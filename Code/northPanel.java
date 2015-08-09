import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class northPanel extends JPanel implements ActionListener{
	
	TextField inputTextField = new TextField("");
	JButton textButton = new JButton("Click to type text");
	//JButton helloWorld = new JButton("Hello World!");
	//JButton random = new JButton("");
	JLabel jl = new JLabel("North Panel");
	
	public northPanel(){
		setSize(50,50);
		setLayout(new GridLayout(3,3));
		System.out.println("Loading North Panel");
		jl.setText("\t" + "North Panel");
		add(jl);
		add(inputTextField);
		add(textButton);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand()==("Click to type text")){
			setSize(getPreferredSize());
			Graphics g = getGraphics();
			textButton.setActionCommand("");
			String s = inputTextField.getText();
			centerPanel.setText(s);
		}
	}
	
}
