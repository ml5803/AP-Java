package gui.screens;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener {

	private Button myButton;
	private TextLabel text;
	private TextArea area;
	private Graphic penguin;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);

	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextLabel(10, 25, 500, 40, "Some text");
		viewObjects.add(text);
		area = new TextArea(400, 50, 300, 100, "This is really long text. It prints more than a single line. Looks good man :)");
		viewObjects.add(area);
		
		myButton = new Button(10,100,100,50,"Big button",new Color(0,76,153), new Action(){
			public void act(){
				//code for action will be in here.
			}
		});
		viewObjects.add(myButton);
		
		penguin = new Graphic(30,30,100,100,"resources/sampleImages/penguin.jpg");
		viewObjects.add(penguin);
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int mx = e.getX();
		int my = e.getY();
		text.setText("Mouse at : " + mx + " , " + my);
	}

	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
}
