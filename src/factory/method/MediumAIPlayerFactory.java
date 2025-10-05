package factory.method;

import player.Player;

public class MediumAIPlayerFactory extends AbstractPlayerFactory {


    @Override
    public Player createPlayer(String name) {

        return new Player(name, "MediumAI");
    }
}
