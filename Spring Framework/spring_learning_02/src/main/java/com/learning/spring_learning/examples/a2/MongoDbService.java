package com.learning.spring_learning.examples.a2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbService implements DataService {

	
	public int[] retrivedata() {
		int[] data = {2,4,55,9,1000};
		return data;
	}
}
