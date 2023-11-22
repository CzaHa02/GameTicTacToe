package com.java.game;

import java.util.Random;
import java.util.Scanner;

public class TurnMaker {
    private static final Scanner scanner = new Scanner(System.in);
    public static void makeComputerTurn(char[][] board, char turnPlayer) {

        System.out.println(turnPlayer + " computers turn");
        Random random = new Random();
        int size = board.length;
        int row, column;

         do{
             row= random.nextInt(size);
             column= random.nextInt(size);
         }
            while (board[row][column] !=0);
            board[row][column] = turnPlayer;

    }

    public static boolean makeAturn(char[][] board, char turnPlayer) {
        System.out.println(turnPlayer + " your play");

        int row, column;

        do {
            System.out.println("Give row index");
            row = scanner.nextInt();
            System.out.println("Give column index");
            column = scanner.nextInt();

            if (isValidInput(row, column, board.length) && board[row][column] == 0) {
                break;
            } else {
                System.out.println("Invalid input or cell already occupied. Try again.");
            }
        } while (true);

        board[row][column] = turnPlayer;
        return true;
    }

    private static boolean isValidInput(int row, int column, int boardSize) {
        return row >= 0 && row < boardSize && column >= 0 && column < boardSize;
    }

}



