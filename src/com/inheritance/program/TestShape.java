package com.inheritance.program;
class GameShape{
	public void displayShape() {
		System.out.println("display is running");
	}
}
class PlayerPiece extends GameShape{
	public void movepiece() {
	System.out.println("moving piece suceesfully");	
	}
}
class TilePiece extends GameShape{
	public void getAdjacent() {
		System.out.println("getting adjacent file");
	}
}
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PlayerPiece ps= new PlayerPiece();
TilePiece tp= new TilePiece();
doShape(tp);
doShape(ps);
//PlayerPiece tp1=(PlayerPiece)tp;

	}
public static void doShape(GameShape shape) {
	shape.displayShape();
}
}
