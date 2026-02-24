package com.test;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// to check if the methods are working or not
@Component
public class ConnectionManager {
	private boolean isConnected = false;
	
	@PostConstruct
	public void connect() {
		System.out.println("Connecting to external services...");
		isConnected = true;
		System.out.println("Connection established isConnected : "+ isConnected);
	}
	
	@PreDestroy
	public void disconnect() {
		System.out.println("Disconnecting from external services...");
		isConnected = false;
		System.out.println("Connection closed isConnected : " + isConnected);
	}
	
	public void operation() {
		if(isConnected) {
			System.out.println("performing operation with action");
		}
		else {
			System.out.println("operation failed not connected");
		}
	}
}
