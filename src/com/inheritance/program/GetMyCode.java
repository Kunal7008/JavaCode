package com.inheritance.program;
class GameShape1{
	public void displayShape() {
		System.out.println("display is running");
	}
}
class PlayerPiece1 extends GameShape1{
	public void movepiece() {
	System.out.println("moving piece suceesfully");	
	}
}
class TilePiece1 extends PlayerPiece1{
	public void getAdjacent() {
		System.out.println("getting adjacent file");
	}
}
public class GetMyCode {

	public static void main(String[] args) {
		GameShape1 gs= new PlayerPiece1();
		//TilePiece1 ts=(TilePiece1)gs;
		//ts.getAdjacent();
		PlayerPiece1 ps2=(PlayerPiece1)gs;
		ps2.displayShape();

	}

}
