package businessFeature;

import businessObject.Message;
import businessService.MessageService;
import dao.MessageDaoImpl;

public class MessageFeature {
	public static Message readMessage(String messageName) {
		return MessageDaoImpl.getMessage(messageName);
	}

	public static void createOrUpdateMessage(Message message) {
		MessageDaoImpl.setMessage(message);
	}
	
	public static Message readMessageWithReadingTime(String messageName) {
		return MessageService.getMessageWithTimestamp(messageName);
	}
	
}
