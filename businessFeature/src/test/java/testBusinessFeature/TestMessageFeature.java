package testBusinessFeature;

import static org.junit.Assert.*;

import org.junit.Test;

import businessFeature.MessageFeature;
import businessObject.Message;

public class TestMessageFeature {

	private static Message expectedMsg1 = new Message("msg1", "myFirstMessage");
	
	@Test
	public void testMsg1() {
		Message actualMsg1 = MessageFeature.readMessage("msg1");
		assertEquals(expectedMsg1, actualMsg1);
	}
	
	@Test
	public void testMsg3() {
		Message expectedMsg3 = new Message("msg3","a third message");
		MessageFeature.createOrUpdateMessage(expectedMsg3);
		Message actualMsg3 = MessageFeature.readMessage("msg3");
		assertEquals(expectedMsg3, actualMsg3);
	}
}
