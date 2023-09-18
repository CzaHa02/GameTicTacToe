package com.java.game;

public class BoardMenage {

    public static boolean isBoardFull(char[][] board) {
        int size = board.length;
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (board[row][column] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printBoard(char[][] board) {
        int size = board.length;

        System.out.print("\t");
        for (int i = 0; i < size; i++) {
            System.out.print(i + ":\t");
        }
        System.out.println();

        for (int row = 0; row < size; row++) {
            System.out.print(row + ":\t");
            for (int column = 0; column < size; column++) {

                System.out.print(board[row][column] + "\t");
            }
            System.out.println();

        }
    }
}
