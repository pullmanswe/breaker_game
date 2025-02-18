package labb;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class SquareCollection {
	private List<RedBox> squares; // Lista som håller alla fyrkanter
	//private int width = 350;
	//private int hight = 50;
	//private int padding = 20;
	private int X =80;
	private int Y =50;
	public SquareCollection() {
		squares = new ArrayList<>(); // Initiera listan
	}

	public void generateRow(int antal) {

		for (int i = 0; i < antal; i++) {
			addSquare(new RedBox((X * i) + Const.padding, Y, Const.box_width, Const.box_hight));}

	}
	public int getX() {return X;}
	public int getY() {return Y;}
	public int getHeight() {return Const.box_hight;}
	public int getWidth() {return Const.box_width;}


	/*  public void  boxOutline() {
    	int a;
    	int b;
    	int c;
    	int d;
    	a =X;
    	b = X+width;
    	c =b+hight;
    	d= X+hight;



    }
	 */
	// Lägg till en fyrkant
	public void addSquare(RedBox square) {
		squares.add(square);
	}

	// Ta bort en fyrkant
	public void removeSquare(RedBox square) {
		squares.remove(square);
	}

	// Flytta alla fyrkanter som en enhet
	public void move(int dx, int dy) {
		for (RedBox square : squares) {
			square.setX(square.getX() + dx); // Flytta i x-led
			square.setY(square.getY() + dy); // Flytta i y-led
		}
	}

	// Rita alla fyrkanter
	public void draw(Graphics2D graphics) {
		for (RedBox square : squares) {
			square.draw(graphics);
		}
	}


}
