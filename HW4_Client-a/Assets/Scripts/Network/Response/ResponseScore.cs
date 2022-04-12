using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ResponseScoreEventArgs : ExtendedEventArgs
{

	public ResponseScoreEventArgs()
	{
		event_id = Constants.SMSG_SCORE;
	}
}

public class ResponseScore : NetworkResponse
{

	public ResponseScore()
	{
        Debug.Log("Player score has increased thanks jose");
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
