import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class westPanel extends JPanel implements ActionListener{

	private JLabel jl = new JLabel();
	private JRadioButton lineButton = new JRadioButton("Line");
	private JRadioButton circleButton = new JRadioButton("Circle");
    private JRadioButton squareButton = new JRadioButton("Square");
    private JButton fontSize = new JButton("Font Size");
    private JTextField fontSizeTextField = new JTextField("Type size here: ");
    private ButtonGroup shapeButtonGroup = new ButtonGroup();
    
   
    
	public westPanel(){
	
		setSize(100, 50);
		setLayout(new GridLayout(10,5));
		
		System.out.println("Loading West Panel");
		jl.setText("\t" + "West Panel");
		add(jl);
		shapeButtonGroup.add(circleButton);
		shapeButtonGroup.add(squareButton);
		shapeButtonGroup.add(fontSize);
		shapeButtonGroup.add(lineButton);
		
		circleButton.addActionListener(this);
		add(circleButton);
		
		squareButton.addActionListener(this);
		add(squareButton);
		
		lineButton.addActionListener(this);
		lineButton.setSelected(true);
		add(lineButton);
		
		
		fontSize.addActionListener(this);
		add(fontSize);
		
		add(fontSizeTextField);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equalsIgnoreCase("Circle")){
			circleButton.setActionCommand("Circle");
			centerPanel.setDrawShape(true);
			centerPanel.setShapeType("Circle");
		}
		else if(e.getActionCommand().equalsIgnoreCase("Square")){
			squareButton.setActionCommand("Square");
			centerPanel.setDrawShape(true);
			centerPanel.setShapeType("Square");
		}
		else if(e.getActionCommand().equalsIgnoreCase("Font Size")){
			int newDrawingSize = Integer.parseInt((fontSizeTextField.getText()));
			centerPanel.setDrawSize(newDrawingSize);
		}
		else if(e.getActionCommand().equalsIgnoreCase("Line")){
			lineButton.setActionCommand("Line");
			centerPanel.setDrawShape(true);
			centerPanel.setShapeType("Line");
		}
	}
}


