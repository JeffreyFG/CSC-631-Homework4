using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ResponseWinEventArgs : ExtendedEventArgs
{

	public ResponseWinEventArgs()
	{
		event_id = Constants.SMSG_WIN;
	}
}

public class ResponseWin : NetworkResponse
{

	public ResponseWin()
	{
        Debug.Log("player won thanks jose");
	}

	public override void parse()
	{
  
	}

	public override ExtendedEventArgs process()
	{
		ResponseMoveEventArgs args = new ResponseMoveEventArgs
		{
		};

		return args;
	}
}
