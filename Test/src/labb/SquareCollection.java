package labb;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class SquareCollection {
    private List<RedBox> squares; // Lista som håller alla fyrkanter

    public SquareCollection() {
        squares = new ArrayList<>(); // Initiera listan
    }
    
    public void generateRow(int antal) {
    	
    		for (int i = 0; i < antal; i++) {
              addSquare(new RedBox((80 * i)+20, 50, 40, 40));
          //    Square redBox = new Square(Color.RED, /* andra parametrar */);
            squares.add(RedBox);
        }
    }

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
