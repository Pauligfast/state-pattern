package com.company;

import java.util.List;

class NotEnoughPlayersState extends GameEngine {

    NotEnoughPlayersState(GameSupervisor gameSupervisor) {
        super(gameSupervisor);
        System.out.println("current state: player number doesn't fit requirements");
    }

    @Override
    void startGame() {
        try {
            throw new Exception("players number does not fit the requirements");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    void setPlayers(List<String> userName) {
        System.out.println("Players set");
        setPlayers = userName;
    }

    @Override
    void deactivatePlayer(String userName) {
        System.out.println(userName + " deactivated");
        setPlayers.remove(userName);
    }
}
