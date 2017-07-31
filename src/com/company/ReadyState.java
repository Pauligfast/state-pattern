package com.company;

import java.util.List;

/**
 * Created by Paulig on 5/16/2017.
 */
public class ReadyState extends GameEngine {



    public ReadyState(GameSupervisor gameSupervisor){
        super(gameSupervisor);
        System.out.println("current state: Ready");
      }

    @Override
    void startGame() {
        System.out.println("game started");
        gameSupervisor.setState(new StartedState(gameSupervisor));
    }

    @Override
    void setPlayers(List<String> userName) {
        System.out.println("Players set");
        setPlayers = userName;
    }

    @Override
    void deactivatePlayer(String userName) {
       setPlayers.remove(userName);
    }
}
