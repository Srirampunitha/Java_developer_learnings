package com.learning.spring_learning.examples.a2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mySqlServicequalifier")
public class MySqlService implements DataService {
	
	public int[] retrivedata() {
		int[] data = {12,44,555,89,90};
		return data;
	}

}
