package com.bridgelabz.tictactoeprogram;

public class TicTacToe {
	char gameBoard[] = null;

	public static void main(String[] args) {
		System.out.println("Welcome to the Tic Tac Toe Game Program in Java!");
		TicTacToe gameObj = new TicTacToe();
		gameObj.initialiseGame();
	}

	void initialiseGame() {
		gameBoard = new char[10];
		for (int index = 0; index < 10; index++)
			gameBoard[index] = ' ';
	}

}