Game character base class:
    abstract class-> Character

Game has 3 character roles:
    Green character
    Sky character
    Water character

Every character can have extra skills:
    Extra skills:
        Animal character
        Plant character
    This is implemented using DECORATOR design pattern so every character role can have more than one extra skill.

Game characters can create elements for specific character role using FACTORY METHOD:
    Green character creates elements of type Green:
    After it has extra skills it can create element of type Animal or Plant

FACADE PATTERN is used to hide "complex" game starting logic:
    Where is necessary to have 3 character roles and added to the game
    Action STRATEGIES are initialized
    And all game actions functions

PROXY PATTERN in this project is used to access game only with game code

STRATEGIES are used for resting and moving of the characters as every character role has different moving or resting
    Example: Sky character is moving by Flying



