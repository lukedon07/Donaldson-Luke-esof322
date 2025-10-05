package factory.method;

import player.Player;

public class StrongAIPlayerFactory extends AbstractPlayerFactory {


    @Override
    public Player createPlayer(String name) {

        return new Player(name, "StrongAI");
    }
}
