package com.Sriram.Rest.Webservices.Restfull_services.helloworld;

public class HelloWorldBean {
   String info ;

public HelloWorldBean(String Message) {
	super();
	this.info = Message;
}

public String getInfo() {
	return info;
}

public void setInfo(String info) {
	this.info = info;
}

@Override
public String toString() {
	return "HelloWorldBean [info=" + info + "]";
}
   
   
}
