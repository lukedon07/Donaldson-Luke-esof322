package factory.method;

public class FClient{


    public FClient() {

        AbstractPlayerFactory humanPlayerFactory = new HumanPlayerFactory();
        humanPlayerFactory.checkPlayerIn("Luke");

        AbstractPlayerFactory spectatorPlayerFactory = new SpectatorPlayerFactory();
        spectatorPlayerFactory.checkPlayerIn("David");

        AbstractPlayerFactory weakAIPlayerFactory = new WeakAIPlayerFactory();
        weakAIPlayerFactory.checkPlayerIn("Leela");

        AbstractPlayerFactory mediumAIPlayerFactory = new MediumAIPlayerFactory();
        mediumAIPlayerFactory.checkPlayerIn("AlphaZero");

        AbstractPlayerFactory strongAIPlayerFactory = new StrongAIPlayerFactory();
        strongAIPlayerFactory.checkPlayerIn("StockFish");
    }

    public static void main(String[] args){
        new FClient();
    }
}
