package com.viswa.interviewQuestions.TicToe;

public class PlayGame {
    public static void main(String[] args) {
        System.out.println("\n===>>> TicTacToe Game\n");
        TicTacToeGame game = new TicTacToeGame();
        game.InitializeGame();
        System.out.print("\n===>>> GAME OVER is: "+game.startGame());



    }
}
