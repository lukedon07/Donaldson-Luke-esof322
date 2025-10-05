package factory.method;


abstract class AbstractPlayerFactory implements IPlayerFactory {


    public void checkPlayerIn(String name) {
        Player p = createPlayer(name);
        System.out.println("Checking Player in: " + p.toString());
    }
}
