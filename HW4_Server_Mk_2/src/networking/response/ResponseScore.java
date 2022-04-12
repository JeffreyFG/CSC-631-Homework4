package networking.response;

import metadata.Constants;
import model.Player;
import utility.GamePacket;
import utility.Log;

public class ResponseScore extends GameResponse
{
    private Player player;
    int score;
    public ResponseScore() {
        responseCode = Constants.SMSG_SCORE;
    }

    @Override
    public byte[] constructResponseInBytes() {
        GamePacket packet = new GamePacket(responseCode);
        packet.addInt32(player.getID());
        Log.printf("player %d score has increased to %d",player.getID(), player.getScore());

        return packet.getBytes();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setData(int score)
    {
        this.score = score;
    }
}
