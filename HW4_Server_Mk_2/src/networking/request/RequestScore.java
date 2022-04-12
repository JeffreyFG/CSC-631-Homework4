package networking.request;

import networking.response.ResponseScore;

import java.io.IOException;
import model.Player;
import utility.DataReader;
import core.NetworkManager;
public class RequestScore extends GameRequest{
    private int pieceIndex, targetIndex;
    // Responses
    private ResponseScore responseScore;

    public RequestScore() {
        responses.add(responseScore = new ResponseScore());
    }

    @Override
    public void parse() throws IOException {
        pieceIndex = DataReader.readInt(dataInput);
        targetIndex = DataReader.readInt(dataInput);
    }

    @Override
    public void doBusiness() throws Exception {
        Player player = client.getPlayer();

        responseScore.setPlayer(player);
//        responseScore.setData(player.getID());
        player.setScore();
        responseScore.setData(20);

        NetworkManager.addResponseForAllOnlinePlayers(player.getID(), responseScore);
    }
}
