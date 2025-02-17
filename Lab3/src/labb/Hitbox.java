package labb;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class Hitbox extends Sprite {
private Bat bat;
private SquareCollection SC;
private Ball ball;
public Hitbox(int x, int y, int width, int height, Ball ball, SquareCollection SC) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		this.ball = ball;
		this.SC = SC;
		
	}

private void collision() {
	if (ball.getX()==SC.boxOutline()) {
		ball.bounceX();
		
	}
}



@Override
public void update(Keyboard keyboard) {
	// TODO Auto-generated method stub
	
}

@Override
public void draw(Graphics2D graphics) {
	// TODO Auto-generated method stub
	
}
}