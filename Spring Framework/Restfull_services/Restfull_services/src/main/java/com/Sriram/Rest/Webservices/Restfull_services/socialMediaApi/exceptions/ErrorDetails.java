package com.Sriram.Rest.Webservices.Restfull_services.socialMediaApi.exceptions;

import java.time.LocalDateTime;

public class ErrorDetails {
      private LocalDateTime TimeStamp;
      private String ErrorDescription ;
      private String Details;
	
      
      public ErrorDetails(LocalDateTime timeStamp, String errorDescription, String details) {
		super();
		TimeStamp = timeStamp;
		ErrorDescription = errorDescription;
		Details = details;
	}
	public LocalDateTime getTimeStamp() {
		return TimeStamp;
	}
	public String getErrorDescription() {
		return ErrorDescription;
	}
	public String getDetails() {
		return Details;
	}
      
}
