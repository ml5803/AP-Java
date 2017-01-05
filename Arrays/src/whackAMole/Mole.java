package whackAMole;

import gui.components.Action;
import gui.components.ClickableGraphics;

public class Mole extends ClickableGraphics implements MoleInterface {

	private int appearanceTime;
	public Mole(int x, int y) {
		super(x, y, 1, "resources/sampleImages/mole.jpg");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getAppearanceTime() {
		return appearanceTime;
	}

	@Override
	public void setAppearanceTime(int screenTime) {
		appearanceTime = screenTime;

	}

}
