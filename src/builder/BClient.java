package builder;

import player.Player;

import java.util.ArrayList;

public class BClient {

    public BClient(){

        ArrayList<Player> p_list = new ArrayList<Player>(){{
            add(new Player("David", "Human"));
            add(new Player("Luke", "Human"));
            add(new Player("Tanner", "Human"));
            add(new Player("Alex", "Human"));
            add(new Player("Will", "Human"));
            add(new Player("Reese", "Human"));
        }};

        PokerGameBuilder game1 = new PokerGameBuilder.Builder()
                .game("Texas Hold-em")
                .num_of_player(6)
                .starting_chip(50000)
                .can_buy(true)
                .player_list(p_list)
                .build();

        System.out.println(game1);

    }

    public static void main(String[] args){
        new BClient();
    }
}
