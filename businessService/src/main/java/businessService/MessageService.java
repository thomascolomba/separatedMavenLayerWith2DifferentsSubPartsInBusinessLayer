package businessService;

import businessObject.Message;
import dao.MessageDaoImpl;

public class MessageService {
	public static Message getMessageWithTimestamp(String messageName) {
		Message message = MessageDaoImpl.getMessage(messageName);
		message.setText(message.getText() + " - "+System.currentTimeMillis());
		return message;
	}

}
