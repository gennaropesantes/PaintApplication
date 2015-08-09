


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class centerPanel extends JPanel implements MouseListener, MouseMotionListener{

	private static int lastX=0;
	private static int lastY=0;
	private static Color penColor = Color.black;
	public static final Color bgColor = Color.WHITE;
	private static boolean drawShape = false;
	private static Color fontColor = Color.BLACK;
	



	private static int drawingSize = 1; //default size
	private static Color shapeColor = Color.black;
	
	private static String shapeType = "";
	
	private static String textInput = "";


	public centerPanel () {

		setBackground(bgColor);
		setForeground(Color.BLUE);
		addMouseListener(this);
		addMouseMotionListener(this);

	}
	protected static void record(int x, int y) {
		lastX = x;
		lastY = y;
	}
	@Override
	public void mouseClicked(MouseEvent clicked) {
		// TODO Auto-generated method stub  
		// Record position that mouse entered window or where user pressed mouse button.
		int x = clicked.getX();
		int y = clicked.getY();
		record(x,y);	
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		requestFocus(); // Plan ahead for typing
		record(e.getX(), e.getY());
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mousePressed(MouseEvent press) {
		// TODO Auto-generated method stub
		int x = press.getX();
		int y = press.getY();
		record(press.getX(), press.getY());
		
		if(drawShape){
			Graphics g = getGraphics();
			Graphics2D g2d = (Graphics2D)g;
			g2d.setColor(shapeColor);
			if(shapeType.equalsIgnoreCase("Square")){
				g2d.setColor(getShapeColor());
				g2d.fillRect(lastX-drawingSize, lastY-drawingSize, 2*drawingSize, 2*drawingSize);
			}
			else if (shapeType.equalsIgnoreCase("Circle")){
				g2d.setColor(getShapeColor());
				g2d.fillOval(lastX-drawingSize, lastY-drawingSize, 2*drawingSize, 2*drawingSize);
			}
			else if (shapeType.equalsIgnoreCase("Line")){
				g2d.setStroke(new BasicStroke(drawingSize));
				g2d.setColor(getPenColor());
				g2d.drawLine(lastX, lastY, x, y);
				record(x, y);
			}
		}
	}
	@Override
	public void mouseReleased(MouseEvent press) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseDragged(MouseEvent drag) {
		// TODO Auto-generated method stub
		int x = drag.getX();
		int y = drag.getY();
		Graphics g = getGraphics();
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(drawingSize));
		g2d.setColor(getPenColor());
		g2d.drawLine(lastX, lastY, x, y);
		record(x, y);
		
		if(drawShape){
			g2d.setColor(shapeColor);
			if(shapeType.equalsIgnoreCase("Square")){
				g2d.setColor(getShapeColor());
				g2d.fillRect(lastX-drawingSize, lastY-drawingSize, 2*drawingSize, 2*drawingSize);
			}
			if (shapeType.equalsIgnoreCase("Circle")){
				g2d.setColor(getShapeColor());
				g2d.fillOval(lastX-drawingSize, lastY-drawingSize, 2*drawingSize, 2*drawingSize);
			}
			if (shapeType.equalsIgnoreCase("Line")){
				g2d.setColor(getShapeColor());
				g2d.drawLine(lastX, lastY, x, y);
			}
		}
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		// Plan ahead for typing
		record(e.getX(), e.getY());
	}
	public static Color getPenColor(){
		return penColor;
	}
	public static void setPenColor(Color pc){
		penColor = pc;
	}
	public static int getLastX(){
		return lastX;
	}
	public static int getLastY(){
		return lastY;
	}

	public static Boolean getDrawShape(){
		return drawShape;
	}
	public static void setDrawShape(boolean yn){

		drawShape = yn;
	}
	public static void setShapeColor(Color sc){
		shapeColor = sc;
	}
	public static Color getShapeColor(){
		return shapeColor;
	} 
	public static Color getFontColor(){
		return fontColor;
	}
	public static void setFontColor(Color fc){
		fontColor = fc;
	}
	public static String getText(){
		return textInput;
	}
	public static void setText(String ti){
		textInput = ti;
	}
	public static int getDrawSize(){
		System.out.println("The get size is: "+drawingSize);
		return drawingSize;
	}
	public static void setDrawSize(int sz){
		System.out.println("The set size is: "+sz);
		drawingSize=sz;
	}
	public static void setShapeType(String st){
		shapeType = st;
	}
	public static Color getBoardColor(){
		return bgColor;
	}
}
