package com.java.game;

public class ConditionChecker {

    public static boolean checkRow(char[][] board, char value) {
        int size = board.length;
        for (int row = 0; row < size; row++) {
            boolean win = true;
            for (int column = 0; column < size; column++) {
                if (board[row][column] != value) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkColumn(char[][] board, char value) {
            int size = board.length;
            for (int column = 0; column < size; column++) {
                boolean win = true;
                for (int row = 0; row < size; row++) {
                    if (board[row][column] != value) {
                        win = false;
                        break;
                    }
                }
                if (win) {
                    return true;
                }
            }
            return false;
        }
    public static boolean checkCross1(char[][] board, char value) {
        int size = board.length;
        for (int i = 0; i < size; i++) {
            if (board[i][i] != value) {
                return false;
            }
        }
        return true;
    }


    public static boolean checkCross2(char[][] board, char value) {
        int size = board.length;
        for (int i = 0; i < size; i++) {
            if (board[i][size - 1 - i] != value) {
                return false;
            }
        }
        return true;
    }

}
