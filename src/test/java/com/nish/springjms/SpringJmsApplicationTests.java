package com.nish.springjms;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nish.springjms.senders.MessageSender;

@SpringBootTest
class SpringJmsApplicationTests {

	@Autowired
	MessageSender sender;
	
	
	
	@Test
	void testSendAndReceive() {
		sender.send("jiji");
	}

}
