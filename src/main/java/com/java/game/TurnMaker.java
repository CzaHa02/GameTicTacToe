package com.java.game;

import java.util.Random;
import java.util.Scanner;

public class TurnMaker {

    public static void makeComputerTurn(char[][] board, char turnPlayer) {
        System.out.println(turnPlayer + " computers turn");
        Random random = new Random();
        int size = board.length;
        int row = random.nextInt(size);
        int column = random.nextInt(size);
        board[row][column] = turnPlayer;

    }

    public static boolean makeAturn(char[][] board, char turnPlayer) {

        System.out.println(turnPlayer + " your play");
        System.out.println("give row index");
        int row = new Scanner(System.in).nextInt();
        System.out.println("give column index");
        int column = new Scanner(System.in).nextInt();


        boolean goodValue = board[row][column] == 0;
        if (!goodValue) {
            System.out.println("bad value");
            return false;
        }
        board[row][column] = turnPlayer;
        return true;

    }


}
