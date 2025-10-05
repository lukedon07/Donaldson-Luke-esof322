package factory.method;

public class HumanPlayerFactory extends AbstractPlayerFactory {
    @Override
    public Player createPlayer(String name) {
        return new Player(name, "Human");
    }
}
