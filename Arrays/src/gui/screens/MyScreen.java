package gui.screens;

import java.awt.Color;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextArea;
import gui.components.Visible;

public class MyScreen extends Screen {
	private Button myButton;
	private TextArea tArea;
	
	
	public MyScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		tArea = new TextArea(50,50,400,400,"THE TEXT HAS CHANGED WOWWWWW!");
		viewObjects.add(tArea);
	}

}
