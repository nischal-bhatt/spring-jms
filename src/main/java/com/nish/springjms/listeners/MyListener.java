package com.nish.springjms.listeners;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {

	@JmsListener(destination = "${springjms.myQueueNishWithSpring}")
	 public void receive(String message)
	 {
		 System.out.println("message received " + message);
	 }
}
