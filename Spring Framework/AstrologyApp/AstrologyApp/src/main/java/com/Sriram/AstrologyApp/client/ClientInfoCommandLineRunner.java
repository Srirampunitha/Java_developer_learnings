package com.Sriram.AstrologyApp.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Sriram.AstrologyApp.client.repo.ClientInfoRepository;

@Component
public class ClientInfoCommandLineRunner implements CommandLineRunner {
    @Autowired   
	private  ClientInfoRepository repo ;
    
  public  static List<ClientInfo> allclientinfo ;
  public static ClientInfo cInfo;
	public void run(String... args) throws Exception {
		repo.save(new ClientInfo(1, "Sriram", "Inamkiliyur", "6382620120l"));
		repo.save(new ClientInfo(2, "Aarthi", "Inamkiliyur", "6382456745"));
		repo.save(new ClientInfo(3, "Ravi", "Pateeshwaram", "8262012056l"));
		repo.save(new ClientInfo(4, "Chandra", "Kumbakonam", "9363826200l"));
		System.out.println(repo.findByPlace("Pateeshwaram"));
		allclientinfo = repo.findAll();
		cInfo=repo.findByName("Sriram");
		System.out.println(repo.findById(2l));
	}
	 public static List<ClientInfo> clientlist(){
		  return allclientinfo ;
	  }
	 
	 public static ClientInfo singleClientInfo() {
		 return cInfo;
	 }

    
}
