import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class theBoardRoom extends JApplet{
	

	centerPanel writingAndDrawingBoard = new centerPanel();
	@Override
	public void init(){
		setSize(1280,800);
		add(new northPanel(), BorderLayout.NORTH);
	    add(new southPanel(), BorderLayout.SOUTH);
	    add(new eastPanel(), BorderLayout.EAST);
	    add(new westPanel(), BorderLayout.WEST);
	    add(writingAndDrawingBoard, BorderLayout.CENTER); 
	}
}
	
