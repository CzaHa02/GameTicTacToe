package com.java.game;

import java.util.Scanner;

public class AllConditions {

    int size = new Scanner(System.in).nextInt();
    boolean ifContinue = true;
    char[][] board = new char[size][size];
    char turnPlayer = 'X';


        public boolean conditions(){

            boolean winRow = ConditionChecker.checkRow(board, turnPlayer);
            boolean winColumn = ConditionChecker.checkColumn(board, turnPlayer);
            boolean winCross1 = ConditionChecker.checkCross1(board, turnPlayer);
            boolean winCross2 = ConditionChecker.checkCross2(board, turnPlayer);
            boolean draw = BoardMenage.isBoardFull(board);

            if (winRow|| winColumn || winCross1||winCross2) {
                System.out.println(turnPlayer + " you won");
                ifContinue = false;
            } else if (draw) {
                System.out.println("its a draw");
                ifContinue = false;
            }
            return true;
    }


    }


