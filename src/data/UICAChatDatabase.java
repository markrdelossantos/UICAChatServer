package data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UICAChatDatabase {
	
	public static final int SEND_TO_ALL = 0;
	
	private static UICAChatDatabase instance = null;
	private List<UICAChatMessage> allTheMessages; 
		
	protected UICAChatDatabase() {
		allTheMessages = new ArrayList<UICAChatMessage>();
	}
	
	public static UICAChatDatabase getInstance() {
		if(instance == null) {
			instance = new UICAChatDatabase();
		}
		return instance;
	}
	
	public synchronized void addNewMessage(UICAChatMessage message){
		allTheMessages.add(message);
	}
	
	public synchronized List<UICAChatMessage> getAllMessagesFor(int userId)
	{
		return allTheMessages.stream()
				.filter( m -> m.getReceiver() == userId)
				.collect(Collectors.toList());
	}

}
