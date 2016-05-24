package data;

import java.util.Date;

public class UICAChatMessage {
	
	private int uMID;
	private int sender;
	private int receiver;
	private String message;
	private Date sentDate;
	
	public UICAChatMessage(int id, int sender, int receiver, String message, Date sentDate){
		this.uMID = id;
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
		this.sentDate = sentDate;
	}
	
	public int getUMID(){
		return this.uMID;
	}
	
	public String getMessage(){
		return message;
	}
	
	public int getReceiver()
	{
		return receiver;
	}
}
