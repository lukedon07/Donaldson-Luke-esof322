package builder;
import player.Player;
import java.util.ArrayList;

public class PokerGameBuilder {

    private String game;
    private Integer num_of_players;
    private Integer starting_chips;
    private Boolean can_buy;
    private ArrayList<Player> player_list;


    private PokerGameBuilder(Builder builder){
        this.game = builder.game;
        this.num_of_players = builder.num_of_players;
        this.starting_chips = builder.starting_chips;
        this.can_buy = builder.can_buy;
        this.player_list = builder.player_list;
    }

    @Override
    public String toString(){
        return "Poker game is " + game + ", there are " + num_of_players
                + " players, each player" + "will start with "
                + starting_chips + " chips.\n Re buys are "
                + can_buy;
    }

    public static class Builder{
        private String game;
        private Integer num_of_players;
        private Integer starting_chips;
        private Boolean can_buy;
        private ArrayList<Player> player_list;


        public Builder game(String game){
            this.game = game;
            return this;
        }

        public Builder num_of_player(Integer num_of_players){
            this.num_of_players = num_of_players;
            return this;
        }

        public Builder starting_chip(Integer starting_chips){
            this.starting_chips = starting_chips;
            return this;
        }

        public Builder can_buy(Boolean can_buy){
            this.can_buy = can_buy;
            return this;
        }

        public Builder player_list(ArrayList<Player> player_list){
            this.player_list = player_list;
            return this;
        }

        public PokerGameBuilder build(){
            return new PokerGameBuilder(this);
        }
    }

}
