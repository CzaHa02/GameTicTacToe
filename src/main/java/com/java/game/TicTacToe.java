package com.java.game;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Please type size of your board");
        Service service = new Service();
        service.start();
    }
}

