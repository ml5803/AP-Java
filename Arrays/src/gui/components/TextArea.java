package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {

	public TextArea(int x, int y, int w, int h, String text) {
		super(x, y, w, h, text);
		update();
	}

	public void update(Graphics2D g){
		g = clear(); //Delete previous text
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(Color.BLACK);
		g.setFont(new Font(getFont(), Font.PLAIN,getSize()));
		if(getText()!=null){
			FontMetrics fm = g.getFontMetrics();
			String[] words = getText().split(" ");
			String currentLn = "";
			int currentHeight = getHeight()-5;
			for(String w: words){
				if((fm.stringWidth(currentLn) + fm.stringWidth(w)) <= getWidth()){
					currentLn+=w;
				} else{
					g.drawString(currentLn, 4, currentHeight);
					currentLn = "";
					currentHeight += fm.getDescent();
				}
			}
		}
	}
}
