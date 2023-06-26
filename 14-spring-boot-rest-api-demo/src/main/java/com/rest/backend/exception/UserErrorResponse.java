package com.rest.backend.exception;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserErrorResponse {
	private int status;
	private String message;
	private String timestamp;

	public UserErrorResponse() {
	}

	public UserErrorResponse(int status, String message, String timestamp) {
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public static String now(String pattern) {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern));
	}

	@Override
	public String toString() {
		return "UserErrorResponse [status=" + status + ", message=" + message + ", timestamp=" + timestamp + "]";
	}
}
