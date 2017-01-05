package gui.components;

public class ClickableGraphics extends Graphic implements Clickable {

	private Action action;
	
	public void setAction(Action a){
		this.action = a;
	}
	
	public ClickableGraphics(int x, int y, String imageLocation,Action action) {
		super(x, y, imageLocation);
		setAction(action);
		// TODO Auto-generated constructor stub
	}

	public ClickableGraphics(int x, int y, int w, int h, String imageLocation, Action action) {
		super(x, y, w, h, imageLocation);
		setAction(action);
		// TODO Auto-generated constructor stub
	}

	public ClickableGraphics(int x, int y, double scale, String imageLocation, Action action) {
		super(x, y, scale, imageLocation);
		setAction(action);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isHovered(int x, int y) {
		if ((x>=this.getX() && x<= this.getX() + this.getWidth()) && (x>=this.getY() && x<= this.getY() + this.getHeight())){
			return true;
		}
		return false;
	}

	@Override
	public void act() {
		if (action!=null){
			this.action.act();
		}
	}

}
