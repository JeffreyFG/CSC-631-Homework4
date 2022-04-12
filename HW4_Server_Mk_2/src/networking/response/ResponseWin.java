package networking.response;

import metadata.Constants;
import model.Player;
import utility.GamePacket;
import utility.Log;

public class ResponseWin extends GameResponse
{
    private Player player;
    int winnerID;
    public ResponseWin() {
        responseCode = Constants.SMSG_WIN;
    }

    @Override
    public byte[] constructResponseInBytes() {
        GamePacket packet = new GamePacket(responseCode);
        packet.addInt32(player.getID());
        Log.printf("player %d won",player.getID());

        return packet.getBytes();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setData(int winnerID)
    {
           this.winnerID = winnerID;
    }
}
