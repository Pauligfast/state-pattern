package com.company;

import java.util.LinkedList;

/**
 * Created by Paulig on 5/16/2017.
 */
public class GameSupervisor {
    GameEngine gameEngine=new NotEnoughPlayersState(this);
    int maxPlayers;
    int minPlayers;
    LinkedList<String> players = new LinkedList<>();

    GameSupervisor(String player, int minPlayers, int maxPlayers) {
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        players.add(player);
        gameEngine.requiredNumOfPlayers();

    }

    void removePlayer(String userName) {
        players.remove(userName);
        System.out.println(userName + " removed from the game");
        gameEngine.requiredNumOfPlayers();
    }

    void addPlayer(String userName) {
        players.add(userName);
        System.out.println(userName + " joined the game");
        gameEngine.requiredNumOfPlayers();
    }

    void startGame() {
        gameEngine.setPlayers(players);
        gameEngine.startGame();
    }

    void dispose() {
        System.out.println("game disposed");
        gameEngine.requiredNumOfPlayers();
    }

    void setState(GameEngine g) {
        gameEngine = g;
    }


}
