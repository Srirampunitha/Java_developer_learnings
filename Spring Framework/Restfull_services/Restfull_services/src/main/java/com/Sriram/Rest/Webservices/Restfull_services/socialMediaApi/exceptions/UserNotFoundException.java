/**
 * 
 */
package com.Sriram.Rest.Webservices.Restfull_services.socialMediaApi.exceptions;

/**
 * @author srira
 *
 */
public class UserNotFoundException extends RuntimeException {
     
	public UserNotFoundException (String message) {
    	  super(message);
      }       
}
