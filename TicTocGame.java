package tictoc.com;


public class TicTocGame {

	public static void main(String[] args) {
		String pl;
		Game g = new Game();
		pl=g.chance();
		g.createBoard();
		g.showBoard();
		g.movePosition(pl);
	}

}
