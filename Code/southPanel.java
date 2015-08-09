import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class southPanel extends JPanel implements ActionListener{
	JLabel jl = new JLabel("Loading South Panel");
	JButton clickHere = new JButton("Click here");
	String[] fontStrings = { "Sans Serif", "Serif"};
	JComboBox fontList = new JComboBox(fontStrings);
	
	public southPanel(){
		setSize(200,200);
		setLayout(new GridLayout(5,1));
		System.out.println("Loading South Panel");
		jl.setText("\t" + "South Panel");
		add(jl);
		fontList.setSelectedIndex(1);
		fontList.addActionListener(this);
		add(clickHere);
		add(fontList);
	
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equalsIgnoreCase("Sans Serif")){
		centerPanel.setText(Font.SANS_SERIF);
		}
		else if(e.getActionCommand().equalsIgnoreCase("Serif")){
		centerPanel.setText(Font.SERIF);
		}
	}
	}

