package com.nishantgupta.JMA2.Response;

import java.time.Instant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
	private String message;
	private String status;
	private Instant timestamp;
	
	
    public ErrorResponse(String message, String status, Instant timestamp) {
        this.message = message;
        this.status = status;
        this.timestamp = timestamp;
    }


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Instant getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}



    

}
