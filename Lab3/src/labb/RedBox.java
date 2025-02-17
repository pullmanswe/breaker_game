package labb;

import java.awt.Color;
import java.awt.Graphics2D;

public class RedBox extends Sprite {

	public RedBox(int x, int y, int width, int height) {
		super(x, y, width, height);
	
		
	}

	@Override
	public void update(Keyboard keyboard) {
	//	setY(getY()+1);

	}

	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(Color.red);
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
