import builder.PokerGame;
import player.Player;

import java.util.ArrayList;

public class Client {

    public Client(){


        ArrayList<Player> p_list = new ArrayList<Player>(){{
            add(new Player("David"));
            add(new Player("Luke"));
            add(new Player("Tanner"));
            add(new Player("Alex"));
            add(new Player("Will"));
            add(new Player("Reese"));
        }};


        PokerGame game1 = new PokerGame.Builder()
                .game("Texas Hold-em")
                .num_of_player(6)
                .starting_chip(50000)
                .can_buy(true)
                .player_list(p_list)
                .build();

        System.out.println(game1);
    }

    public static void main(String[] args){
        new Client();
    }
}
