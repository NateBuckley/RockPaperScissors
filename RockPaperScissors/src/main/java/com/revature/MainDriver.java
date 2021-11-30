package com.revature;

import java.util.Scanner;

public class MainDriver {
	
	private static final String ROCK = "rock";
	private static final String PAPER = "paper";
	private static final String SCISSORS = "scissors";

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		boolean isRunning = true;
		boolean isWaitingP1;
		boolean isWaitingP2;
		String player1;
		String player2;
		
		System.out.println("Welcome to Rock, Paper, Scissors!");
		
		outerloop:
		while(isRunning) {
			isWaitingP1 = true;
			isWaitingP2 = true;
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("What is player 1's choice?");
			System.out.println("Enter 'rock,' 'paper,' or 'scissors' to make your move or 'quit' to quit.");
			System.out.println("First letter of any choice also works.");
			player1 = sc.nextLine();
			while(isWaitingP1) {
				if (player1.equalsIgnoreCase("quit") || player1.equalsIgnoreCase("q")) {
					isWaitingP1 = false;
					isRunning = false;
					break outerloop;
				} else if (player1.equalsIgnoreCase(ROCK) || player1.equalsIgnoreCase("r")) {
					player1 = ROCK;
					isWaitingP1 = false;
				} else if (player1.equalsIgnoreCase(PAPER) || player1.equalsIgnoreCase("p")) {
					player1 = PAPER;
					isWaitingP1 = false;
				} else if (player1.equalsIgnoreCase(SCISSORS) || player1.equalsIgnoreCase("s")) {
					player1 = SCISSORS;
					isWaitingP1 = false;
				} else {
					System.out.println("That's an invalid input!");
				}
			}
			
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("What is player 2's choice?");
			System.out.println("Enter 'rock,' 'paper,' or 'scissors' to make your move or 'quit' to quit.");
			System.out.println("First letter of any choice also works.");
			player2 = sc.nextLine();
			
			while(isWaitingP2) {
				if (player2.equalsIgnoreCase("quit") || player2.equalsIgnoreCase("q")) {
					isWaitingP2 = false;
					isRunning = false;
					break outerloop;
				} else if (player2.equalsIgnoreCase(ROCK) || player2.equalsIgnoreCase("r")) {
					player2 = ROCK;
					isWaitingP2 = false;
				} else if (player2.equalsIgnoreCase(PAPER) || player2.equalsIgnoreCase("p")) {
					player2 = PAPER;
					isWaitingP2 = false;
				} else if (player2.equalsIgnoreCase(SCISSORS) || player2.equalsIgnoreCase("s")) {
					player2 = SCISSORS;
					isWaitingP2 = false;
				} else {
					System.out.println("That's an invalid input!");
				}
			}
			
			System.out.println("");
			checkWinner(player1, player2);
			System.out.println("");
		}
		
		sc.close();
		
		System.out.println("Thanks for playing Rock, Paper, Scissors!");
	}
	
	public static void checkWinner(String player1, String player2) {
		if (player1.equalsIgnoreCase(player2)) {
			System.out.println("It's a TIE!");
		} else if ((player1.equalsIgnoreCase(ROCK) && player2.equalsIgnoreCase(SCISSORS)) || 
				(player1.equalsIgnoreCase(PAPER) && player2.equalsIgnoreCase(ROCK)) || 
				(player1.equalsIgnoreCase(SCISSORS) && player2.equalsIgnoreCase(PAPER))) {
			
			System.out.println("PLAYER 1 WINS!");
			
		} else if ((player2.equalsIgnoreCase(ROCK) && player1.equalsIgnoreCase(SCISSORS)) || 
				(player2.equalsIgnoreCase(PAPER) && player1.equalsIgnoreCase(ROCK)) || 
				(player2.equalsIgnoreCase(SCISSORS) && player1.equalsIgnoreCase(PAPER))) {
			
			System.out.println("PLAYER 2 WINS!");
			
		} else {
			System.out.println("Something went wrong when trying to figure out who won!");
		}
	}

}
