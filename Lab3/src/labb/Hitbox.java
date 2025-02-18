package labb;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class Hitbox  {
	private Bat bat;
	private SquareCollection SC;
	private Ball ball;

	public Hitbox(Ball ball, SquareCollection SC, Bat bat) {

		// TODO Auto-generated constructor stub
		this.ball = ball;
		this.SC = SC;
		this.bat = bat;

	}






	public void update(Keyboard keyboard) {
		// TODO Auto-generated method stub
		System.out.println(ball.getY());
		if (ball.getY()<=SC.getX()  ) {
			ball.bounceY();


		}	
	}



	public void draw(Graphics2D graphics) {
		// TODO Auto-generated method stub

	}
}