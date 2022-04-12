package networking.request;

import networking.response.ResponseWin;

import java.io.IOException;
import model.Player;
import networking.response.ResponseWin;
import utility.DataReader;
import core.NetworkManager;
public class RequestWin extends GameRequest{
    private int pieceIndex, targetIndex;
    // Responses
    private ResponseWin responseWin;

    public RequestWin() {
        responses.add(responseWin = new ResponseWin());
    }

    @Override
    public void parse() throws IOException {
        pieceIndex = DataReader.readInt(dataInput);
        targetIndex = DataReader.readInt(dataInput);
    }

    @Override
    public void doBusiness() throws Exception {
        Player player = client.getPlayer();

        responseWin.setPlayer(player);
        responseWin.setData(player.getID());
        NetworkManager.addResponseForAllOnlinePlayers(player.getID(), responseWin);
    }
}
