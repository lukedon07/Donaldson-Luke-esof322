package factory.method;

public class SpectatorPlayerFactory extends AbstractPlayerFactory{
    @Override
    public Player createPlayer(String name) {
        return new Player(name, "Spectator");
    }
}
