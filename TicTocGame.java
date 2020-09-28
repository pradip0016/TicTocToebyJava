package tictoc.com;


public class TicTocGame {

	public static void main(String[] args) {
	
		Game g = new Game();
		g.createBoard();
		g.showBoard();
		g.movePosition();
	}

}
