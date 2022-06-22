package com.nish.springjms.senders;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Value("${springjms.myQueueNishWithSpring}")
	private String queue;
	
	public void send(String message)
	{
		MessageCreator mc =  s -> s.createTextMessage("hello spring hms");
		this.jmsTemplate.send(queue,mc);
	}
}
