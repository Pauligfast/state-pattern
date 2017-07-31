package com.company;

import java.util.List;

class StartedState extends GameEngine {

    StartedState(GameSupervisor gameSupervisor) {
        super(gameSupervisor);
        System.out.println("current state: Started");
    }

    @Override
    void startGame() {
        try {
            throw new Exception("game is already started!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    void setPlayers(List<String> userName) {
        System.out.println("can't set players. game is already in progress");
    }

    @Override
    void deactivatePlayer(String userName) {
        System.out.println("can't deactivate player. game in progress");
    }

    @Override
    void requiredNumOfPlayers(){
        if (gameSupervisor.players.size() >=gameSupervisor.minPlayers && gameSupervisor.players.size() <= gameSupervisor.maxPlayers) gameSupervisor.setState(new StartedState(gameSupervisor));
        else gameSupervisor.setState(new NotEnoughPlayersState(gameSupervisor));
    }
}
