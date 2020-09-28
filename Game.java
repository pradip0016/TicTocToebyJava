package tictoc.com;

import java.util.Random;
import java.util.Scanner;

public class Game {
	Scanner s = new Scanner(System.in);
	char[] board = new char[10];
	char PlayerMark;
	boolean endgame = true;
	String playername,name;
	
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
	
	/* UC3 Show Board Layout */
	public void showBoard() {
		System.out.print("\n---------------");
		System.out.print("\n " + board[1] + " | " + board[2] + " | " + board[3] + " |");
		System.out.print("\n--------------");
		System.out.print("\n " + board[4] + " | " + board[5] + " | " + board[6] + " |");
		System.out.print("\n---------------");
		System.out.print("\n " + board[7] + " | " + board[8] + " | " + board[9] + " |");
		System.out.print("\n---------------");
		System.out.println("\n");
	}
int row;
	public void movePosition(String pl) {
		while (true) {
			System.out.println("Player "+pl+" Enter row number");
			row = s.nextInt();
			
			if (row < 0 || row > 9) {
				System.out.println("Your row and col out of Board");
			} else if (board[row] != ' ') {
				System.out.println("Someone Already Used that position");
			} else {
				char value = determineInput();
				board[row] = value;
				showBoard();
			}
			if(pl.equalsIgnoreCase(name))
	    	{
	    		pl="computer";
	    	}
	    	else
	    	{
	    		pl=name;
	    	}
	  }
}
	/* UC5 player choice */
	public String chance() {
		int result;
		Random randomNum = new Random();
		result = randomNum.nextInt(2);
		System.out.println("Enter First Player name");
		name=s.next();
		System.out.println(name+" enter 0 for Head and 1 for Tail");
		int ch = s.nextInt();
		if (result == ch) {
			System.out.println(name +"Play First");
			playername = name;
			return playername;
		} else {
			System.out.println("Computer Play First");
			playername = "computer";
		return playername;
		}
	}
	
}