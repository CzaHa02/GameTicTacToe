package com.java.game;

public class TicTacToe {



    public static void main(String[] args) {
        ScoreManager scoreWhenGameStarts = new ScoreManager();
        System.out.println("Welcome in TicTacToe game");
        scoreWhenGameStarts.displayScores();
        System.out.println("Please type size of your board to start game");
        Service service = new Service();
        service.start();
    }


    }


