package factory.method;

public class MediumAIPlayerFactory extends AbstractPlayerFactory {


    @Override
    public Player createPlayer(String name) {

        return new Player(name, "MediumAI");
    }
}
