package com.company;

import java.util.List;

/**
 * Created by Paulig on 5/16/2017.
 */
public abstract class GameEngine {
    List<String> setPlayers;

    GameSupervisor gameSupervisor;

    abstract void startGame();
    abstract void setPlayers(List<String> userName);
    GameEngine(GameSupervisor gameSupervisor) {
        this.gameSupervisor = gameSupervisor;
    }


    abstract void deactivatePlayer(String userName);

    void requiredNumOfPlayers() {
        if (gameSupervisor.players.size() >=gameSupervisor.minPlayers && gameSupervisor.players.size() <= gameSupervisor.maxPlayers) gameSupervisor.setState(new ReadyState(gameSupervisor));
        else gameSupervisor.setState(new NotEnoughPlayersState(gameSupervisor));
    }

}
