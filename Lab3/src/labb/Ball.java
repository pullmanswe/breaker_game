package labb; 

import java.awt.Color;
import java.awt.Graphics2D;

//private int positionX;
//private int positionY;
//protected int speed = 5;

public class Ball extends Sprite {

	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub

	}
	
	private int dx;
	private int dy;

	public void move() {
		setX(getX() + dx*Const.ball_speed);
		setY(getY() + dy*Const.ball_speed);
	}

	public void bounceX()
	{
		dx = -dx;
	}
	public void bounceY()
	{
		dy = -dy;
	}


	public void start() {
		dy+=Const.ball_speed;
		dx+=Const.ball_speed;
	}
	@Override
	public void update(Keyboard keyboard) {

		/*if(keyboard.isKeyDown(Key.Down))
	setY(getY()+2);
if(keyboard.isKeyDown(Key.Up))
	setY(getY()-2);
if(keyboard.isKeyDown(Key.Left))
	setX(getX()-2);
if(keyboard.isKeyDown(Key.Right))
	setX(getX()+2);*/


		if(getX()<=0) bounceX();
		else if(getY()<=0) bounceY();
		else if(getX()>=800-getWidth()) bounceX();
		else if(getY()>= 600-getWidth()) bounceY();

	}

	public int getX() {
		return super.getX(); 
	}

	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(Color.white);
		graphics.fillOval(getX(), getY(), getWidth(), getHeight());


	}

	public void setPosition(int i, int j) {
		// TODO Auto-generated method stub
		setX(i);
		setY(j);
	}

}
