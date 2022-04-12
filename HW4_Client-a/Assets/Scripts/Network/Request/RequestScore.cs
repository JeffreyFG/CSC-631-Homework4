using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class RequestScore : NetworkRequest
{
    // Start is called before the first frame update
    public RequestScore()
    {
        request_id = Constants.CMSG_SCORE;
    }

    // Update is called once per frame
    public void send()
    {
        packet = new GamePacket(request_id);
		packet.addInt32(226);
    }
}
