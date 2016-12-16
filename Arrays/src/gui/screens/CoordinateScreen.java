package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener {

	private Button myButton;
	private TextLabel text;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);

	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextLabel(20, 200, 500, 40, "Some text");
		viewObjects.add(text);
		
		myButton = new Button(40,50,100,30,"Button con un nombre largo",new Color(0,76,153), new Action(){
			public void act(){
				//code for action will be in here.
			}
		});
		viewObjects.add(myButton);
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
