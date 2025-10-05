package factory.method;

import player.Player;

import java.util.ArrayList;

public class PokerGame {

    private String game;
    private Integer num_of_players;
    private Integer starting_chips;
    private Boolean can_buy;
    private ArrayList<Player> player_list;

    public PokerGame(String game, Integer num_of_players, Integer starting_chips, Boolean can_buy, ArrayList<Player> player_list){
        this.game = game;
        this.num_of_players = num_of_players;
        this.starting_chips = starting_chips;
        this.can_buy = can_buy;
        this.player_list = player_list;
    }

    @Override
    public String toString(){
        return "Poker game is " + game + ", there are " + num_of_players
                + " players, each player" + "will start with "
                + starting_chips + " chips.\n Re buys are "
                + can_buy;
    }
}
