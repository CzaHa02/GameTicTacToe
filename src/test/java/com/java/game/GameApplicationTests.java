package com.java.game;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GameApplicationTests {
    public static void main(String[] args) {
        testCheckRowX();
        testCheckRowO();
        testCheckColumnX();
        testCheckColumnO();
        testCheckCross1X();
        testCheckCross2X();
        testCheckCross2O();
        testCheckCross1O();
        testCheckDraw();
        testBadValue();
    }

    @Test
    public static void testCheckRowX() {
        char[][] board = {
                {'X', 'X', 'X'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
        System.out.println("Win in row tester for X");
        boolean resultXRowWin = ConditionChecker.checkRow(board, 'X');
        Assert.assertEquals(true, resultXRowWin);
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
        boolean resultORowWin = ConditionChecker.checkRow(board, 'O');
        Assert.assertEquals(true, resultORowWin);
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
        boolean resultXColumnWin = ConditionChecker.checkColumn(board, 'X');
        Assert.assertEquals(true, resultXColumnWin);
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
        boolean resultXColumnWin = ConditionChecker.checkColumn(board, 'O');
        Assert.assertEquals(true, resultXColumnWin);
        System.out.println("did the column of 'O' win? " + resultXColumnWin);
        System.out.println();

    }


    public static void testCheckCross1X() {
        char[][] board = {{'X', '-', '-'},
                          {'-', 'X', '-'},
                          {'-', '-', 'X'}
        };
        System.out.println("Win in cross1X tester");
        boolean resultXCross1Win = ConditionChecker.checkCross1(board, 'X');
        Assert.assertEquals(true, resultXCross1Win);
        System.out.println("did the cross1 of 'X' win? " + true);
        System.out.println();
    }

    public static void testCheckCross2X() {
        char[][] board = {{'-', '-', 'X'},
                          {'-', 'X', '-'},
                          {'X', '-', '-'}
        };
        System.out.println("Win in cross2X tester");
        boolean resultXCross1Win = ConditionChecker.checkCross2(board, 'X');
        Assert.assertEquals(true, resultXCross1Win);
        System.out.println("did the cross2 of 'X' win? " + true);
        System.out.println();
    }

    public static void testCheckCross1O() {
        char[][] board = {{'O', '-', '-'},
                          {'-', 'O', '-'},
                          {'-', '-', 'O'}
        };
        System.out.println("Win in cross1 tester");
        boolean resultOCross1Win = ConditionChecker.checkCross1(board, 'O');
        Assert.assertEquals(true, resultOCross1Win);
        System.out.println("did the cross1 of 'O' win? " + true);
        System.out.println();
    }
    public static void testCheckCross2O() {
        char[][] board = {{'-', '-', 'O'},
                         {'-', 'O', '-'},
                         {'O', '-', '-'}
        };
        System.out.println("Win in cross2O tester");
        boolean resultXCross1Win = ConditionChecker.checkCross2(board, 'O');
        Assert.assertEquals(true, resultXCross1Win);
        System.out.println("did the cross2X of 'O' win? " + true);
        System.out.println();
    }



    public static void testCheckDraw() {
        char[][] board = {{'X', 'X', 'X'},
                          {'X', 'O', 'X'},
                          {'O', 'X', 'X'}
        };
        System.out.println("Draw tester");
        boolean resultDraw = BoardMenage.isBoardFull(board);
        Assert.assertEquals(true, resultDraw);
        System.out.println(resultDraw);
        System.out.println();
    }


    public static void testBadValue(){
        char[][] board = {{'X', 'X', 'X'},
                          {'X', 'X', 'X'},
                          {'X', 'X', 'X'}
        };
       System.out.println("bad value tester");
        boolean resultBadValue=TurnMaker.makeAturn(board, 'X');
        Assert.assertEquals(false,resultBadValue);
       System.out.println();
    }
}

