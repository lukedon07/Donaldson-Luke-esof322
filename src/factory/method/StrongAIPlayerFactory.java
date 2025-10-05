package factory.method;

public class StrongAIPlayerFactory extends AbstractPlayerFactory {


    @Override
    public Player createPlayer(String name) {

        return new Player(name, "StrongAI");
    }
}
