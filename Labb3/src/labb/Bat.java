package labb;

import java.awt.Color;
import java.awt.Graphics2D;

public class Bat extends Sprite {
	private Ball ball;
	int speed=10;
	int padelXmax;
	int padelXmin;
	
	
	public Bat(int x, int y, int width, int height, Ball ball) {
		super(x, y, width, height);
		 this.ball = ball;
	}
	
	
	@Override
	public void update(Keyboard keyboard) {
		
		if(keyboard.isKeyDown(Key.Left)&& getX()>0)
			setX(getX()-speed);
		if(keyboard.isKeyDown(Key.Right) && getX()+getWidth()<800)
			setX(getX()+speed);
		
		
		if(ball.getY() + ball.getHeight() >= getY() // Bollens botten når eller passerar paddelns topp
			    && ball.getY() + ball.getHeight() <= getY() + getHeight() // Bollens botten är fortfarande inom paddelns höjd
			    && ball.getX() + ball.getWidth() >= getX() // Bollens högra sida är till höger om paddelns vänstra kant
			    && ball.getX() <= getX() + getWidth())
		{
		ball.bounceY();
		}
		}

	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(Color.gray);
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
