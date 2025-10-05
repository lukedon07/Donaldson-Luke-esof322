package factory.method;

import player.Player;

public class WeakAIPlayerFactory extends AbstractPlayerFactory {


    @Override
    public Player createPlayer(String name) {
        return new Player(name, "WeakAI");
    }
}
