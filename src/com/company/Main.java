package com.company;

public class Main {

    public static void main(String[] args) {
        GameSupervisor g = new GameSupervisor ( "1" , 3 , 5 ) ;




        g . addPlayer ( "2" ) ;

        g . addPlayer ( "3" ) ;

        g . removePlayer ( "2" ) ;
        g.startGame();

// w tym momencie g.startGame rzuciłoby wyjątek.

                g . addPlayer ( "4" ) ;

        g . addPlayer ( "5" ) ;

        g . addPlayer ( "6" ) ; //graczy wciąż jest 5

        g.addPlayer("7");

        g . removePlayer ( "5" ) ;

        g . removePlayer ( "1" ) ;

        g . startGame ( ) ;

        g . removePlayer( "3" ) ;

        g . removePlayer( "6");

    }
}
