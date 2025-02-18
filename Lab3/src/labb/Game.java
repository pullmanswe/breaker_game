package labb;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.*;

public class Game {
	private Hitbox hitbox;
	private SquareCollection squareCollection;
	private Ball b;
	private int TickCounter =0;
	private Bat bat;
	private int antal = 10;
	private GameBoard board;




	public Game(GameBoard board) {
		this.board = board;
		squareCollection = new SquareCollection();
		squareCollection.generateRow(antal); // Generera 10 röda rutor

		b =new Ball(0,0,15,15);
		bat = new Bat(400,550, 80,20, b);	
		hitbox = new Hitbox(b, squareCollection, bat);
	}



	public void update(Keyboard keyboard) {
		//	System.out.println(b.getX());   debug
		if (TickCounter == 0) {
			b.setPosition(board.getWidth() / 2, board.getHeight() / 2); // Sätter bollen centralt
		}

		TickCounter++;
		//		dx+=b.getX();
		//		dy+=b.getY();

		if(TickCounter==1)b.start();
		b.move();



		hitbox.update(keyboard);
		b.update(keyboard);
		squareCollection.move(0, 0); 
		bat.update(keyboard);       
	}

	public void draw(Graphics2D graphics) {
		squareCollection.draw(graphics); // Rita alla fyrkanter
		b.draw(graphics);
		bat.draw(graphics);
	}
}
