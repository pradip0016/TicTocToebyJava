package tictoc.com;

public class Game {
	char[] board = new char[10];

	/* UC1 Initialize Array */
	public void createBoard() {

		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';

		}
	}
}
