package com.company;

import com.company.game_process.GameProcessProxy;
import com.company.game_process.IGameProcess;
import com.company.game_process.GameProcessImpl;

public class Main {

    public static void main(String[] args) {

        IGameProcess gameProcess = new GameProcessProxy("parole");
        gameProcess.createGame();
        System.out.println("\n");

        gameProcess.gameAction(gameProcess.randomAction(), gameProcess.randomChar());
        gameProcess.gameAction(gameProcess.randomAction(), gameProcess.randomChar());
        gameProcess.updateCharacter(gameProcess.randomChar(), gameProcess.randomExtra());
        System.out.println("\n");

        gameProcess.gameAction(gameProcess.randomAction(), gameProcess.randomChar());
        gameProcess.gameAction(gameProcess.randomAction(), gameProcess.randomChar());
        gameProcess.updateCharacter(gameProcess.randomChar(), gameProcess.randomExtra());


    }

}
