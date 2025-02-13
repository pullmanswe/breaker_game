package labb;

import java.awt.Color;
import java.awt.Graphics2D;

public class BlueBox extends Sprite {

	public BlueBox(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Keyboard keyboard) {
		setX(getX()+1);

	}

	@Override
	public void draw(Graphics2D graphics) {
		// TODO Auto-generated method stub'
		graphics.setColor(Color.blue);
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());

	}

}
