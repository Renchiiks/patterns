package com.company.game_process;


import java.util.ArrayList;

public class GameProcessProxy implements IGameProcess {
    private GameProcessImpl gameProcess = new GameProcessImpl();
    String gamePassword;

    public GameProcessProxy(String newGamePassword) {
        this.gamePassword = newGamePassword;
    }

    private boolean isPasswordValid() {
        if (gamePassword.equals("parole")) {
            return true;
        } else {
            System.out.println("Wrong game code");
            return false;
        }
    }


    @Override
    public ArrayList createGame() {
        if (isPasswordValid()) {

            return gameProcess.createGame();
        }
        return null;
    }

    @Override
    public void gameAction(int randomAction, int characterIndex) {
        if (isPasswordValid()) {
            gameProcess.gameAction(randomAction, characterIndex);
        }

    }

    @Override
    public void updateCharacter(int characterIndex, int characterType) {
        if (isPasswordValid()) {
            gameProcess.updateCharacter(characterIndex, characterType);
        }
    }

    @Override
    public int randomExtra() {
        return gameProcess.randomExtra();
    }

    @Override
    public int randomChar() {
        return gameProcess.randomChar();
    }

    @Override
    public int randomAction() {
        return gameProcess.randomAction();
    }
}
