package com.company.game_process;

import com.company.char_building.Character;
import com.company.char_building.*;
import com.company.strategies.*;

import java.util.ArrayList;

public class GameProcessImpl implements IGameProcess {

    ArrayList<Character> gameCharacters = new ArrayList<>();

    public ArrayList createGame() {


        IMoving movingWalking = new Walking();
        IMoving movingSwimming = new Swimming();
        IMoving movingFlying = new Flying();

        IResting restingSleeping = new Sleeping();
        IResting restingFloating = new Floating();


        Character greenCharacter = new GreenChar(movingWalking, restingSleeping);
        Character skyCharacter = new SkyChar(movingFlying, restingFloating);
        Character waterCharacter = new WaterChar(movingSwimming, restingFloating);

        gameCharacters.add(greenCharacter);
        gameCharacters.add(skyCharacter);
        gameCharacters.add(waterCharacter);

        System.out.println("Game is created");

        return gameCharacters;
    }

    public void gameAction(int randomAction, int characterIndex) {
        Character character = gameCharacters.get(characterIndex);
        switch (randomAction) {
            case 1:
                character.createElement();
                System.out.println(character.getName() + character.createElement());
                break;
            case 2:
                System.out.println(character.getName() + " is moving" + character.getMoving().move());
                break;
            case 3:
                System.out.println(character.getName() + " is resting " + character.getResting().rest());//Water Character is resting  by sleeping
                break;
        }
    }

    public void updateCharacter(int characterIndex, int characterType) {//Character has extra skills Green Character
        Character character = gameCharacters.get(characterIndex);
        System.out.println(character.getName());
        switch (characterType) {
            case 1:
                AnimalChar animalCharacter = new AnimalChar(character);
                break;
            case 2:
                PlantChar plantCharacter = new PlantChar(character);

                break;
        }
    }

    public int randomExtra() {
        return (int) (Math.random() * 2 + 1);
    }

    public int randomChar() {
        return (int) (Math.random() * 2 + 0);
    }

    public int randomAction() {
        return (int) (Math.random() * 3 + 1);
    }


}
