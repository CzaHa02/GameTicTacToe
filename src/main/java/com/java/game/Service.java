package com.java.game;
public class Service extends AllConditions {

    public void start() {
        int turnCounter = 0;
        while (ifContinue && turnCounter <= size * size) {
            BoardMenage.printBoard(board);

            if (turnPlayer == 'X') {
                boolean goodValue = TurnMaker.makeAturn(board, turnPlayer);
                if (goodValue) {
                    conditions();
                }
                turnPlayer = 'O';
                turnCounter++;
            } else {
                TurnMaker.makeComputerTurn(board, turnPlayer);
                 conditions();
                turnPlayer = 'X';
                turnCounter++;

            }
        }
    }
}




