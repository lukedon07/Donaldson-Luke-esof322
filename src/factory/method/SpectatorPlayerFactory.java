package factory.method;

import player.Player;

public class SpectatorPlayerFactory extends AbstractPlayerFactory{
    @Override
    public Player createPlayer(String name) {
        return new Player(name, "Spectator");
    }
}
