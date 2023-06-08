package com.java.game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GameApplicationTests {
    public static void main(String[] args) {
        testCheckRowX();
        testCheckRowO();
        testCheckColumnX();
        testCheckColumnO();
        testCheckCross1X();
        testCheckCross1O();
        testCheckDraw();
        //testBadValue();
    }

    @Test
    public static void testCheckRowX() {
        char[][] board = {
                {'X', 'X', 'X'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
        System.out.println("Win in row tester for X");
        boolean resultXRowWin = TicTacToe.checkRow(board, 'X');
        Assertions.assertEquals(true, resultXRowWin);
        System.out.println("did the row of 'X' win? " + resultXRowWin);
        System.out.println();
    }

    @Test
    public static void testCheckRowO() {
        char[][] board = {
                {'O', 'O', 'O'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
        System.out.println("Win in row tester for O");
        boolean resultORowWin = TicTacToe.checkRow(board, 'O');
        Assertions.assertEquals(true, resultORowWin);
        System.out.println("did the row of 'O' win? " + resultORowWin);
        System.out.println();
    }


    public static void testCheckColumnX() {
        char[][] board = {
                {'X', '-', '-'},
                {'X', '-', '-'},
                {'X', '-', '-'}
        };
        System.out.println("Win in column tester for X");
        boolean resultXColumnWin = TicTacToe.checkColumn(board, 'X');
        Assertions.assertEquals(true, resultXColumnWin);
        System.out.println("did the column of 'X' win? " + resultXColumnWin);
        System.out.println();
    }

    public static void testCheckColumnO() {
        char[][] board = {
                {'O', '-', '-'},
                {'O', '-', '-'},
                {'O', '-', '-'}
        };
        System.out.println("Win in column tester for O");
        boolean resultXColumnWin = TicTacToe.checkColumn(board, 'O');
        Assertions.assertEquals(true, resultXColumnWin);
        System.out.println("did the column of 'O' win? " + resultXColumnWin);
        System.out.println();
    }


    public static void testCheckCross1X() {
        char[][] board = {{'X', '-', '-'},
                {'-', 'X', '-'},
                {'-', '-', 'X'}
        };
        System.out.println("Win in cross1 tester");
        boolean resultXCross1Win = TicTacToe.checkCross1(board, 'X');
        Assertions.assertEquals(true, resultXCross1Win);
        System.out.println("did the cross1 of 'X' win? " + true);
        System.out.println();
    }

    public static void testCheckCross1O() {
        char[][] board = {{'O', '-', '-'},
                {'-', 'O', '-'},
                {'-', '-', 'O'}
        };
        System.out.println("Win in cross1 tester");
        boolean resultOCross1Win = TicTacToe.checkCross1(board, 'O');
        Assertions.assertEquals(true, resultOCross1Win);
        System.out.println("did the cross1 of 'O' win? " + true);
        System.out.println();
    }

    public static void testCheckDraw() {
        char[][] board = {{'X', 'X', 'X'},
                {'X', 'O', 'X'},
                {'O', 'X', 'X'}
        };
        System.out.println("Draw tester");
        boolean resultDraw = TicTacToe.isBoardFull(board);
        Assertions.assertEquals(true, resultDraw);
        System.out.println(resultDraw);
        System.out.println();
    }


   // public static void testBadValue(){
      //  char[][] board = {{'X', 'X', 'X'},
                        //  {'-', '-', 'X'},
                        //  {'O', 'X', 'X'}
      //  };
      //  System.out.println("bad value tester");
      //  boolean resultBadValue=TicTacToe.makeAturn(board, 'X');
      //  Assertions.assertEquals(false,resultBadValue);
       // System.out.println();
   // }
}

