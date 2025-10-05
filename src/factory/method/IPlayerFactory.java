package factory.method;
import player.Player;

public interface IPlayerFactory {

    Player createPlayer(String name);
}
