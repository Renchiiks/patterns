package com.company.game_process;

import java.util.ArrayList;

public interface IGameProcess {

    ArrayList createGame();

    void gameAction(int randomAction, int characterIndex);

    void updateCharacter(int characterIndex, int characterType);

    int randomExtra();

    int randomChar();

    int randomAction();
}
