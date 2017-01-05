package whackAMole;

import java.awt.Graphics2D;

import gui.components.Component;

public class Player extends Component implements PlayerInterface {

	private int score =0;
	public Player(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void increaseScore(int i) {
		score += i;
	}

	@Override
	public void update(Graphics2D g) {
		
	}

}
