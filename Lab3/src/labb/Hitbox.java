package labb;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class Hitbox  {
private Bat bat;
private SquareCollection SC;
private Ball ball;
public Hitbox() {
		
		// TODO Auto-generated constructor stub
		this.ball = ball;
		this.SC = SC;
		
	}






public void update(Keyboard keyboard) {
	// TODO Auto-generated method stub

		if (ball.getX()>SC.getX() && ball.getX()< (SC.getX()+SC.getWidth()) ) {
			ball.bounceX();
		}	
		}



public void draw(Graphics2D graphics) {
	// TODO Auto-generated method stub
	
}
}