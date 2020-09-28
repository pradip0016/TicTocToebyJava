package tictoc.com;

import java.util.Scanner;

public class Game {
	Scanner s = new Scanner(System.in);
	char[] board = new char[10];
	char PlayerMark;
	
	/* UC1 Initialize Array */
	public void createBoard() {

		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';

		}
	}
	
	/* UC2 Asking For Input */
	public char determineInput() {
		System.out.println("enter input X or O");
		PlayerMark = s.next().charAt(0);
		if (PlayerMark == 'x') {
			PlayerMark = 'x';
		} else {
			PlayerMark = 'o';
		}
		return PlayerMark;
	}

}
