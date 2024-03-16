package com.Sriram.AstrologyApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sriram.AstrologyApp.client.ClientInfo;
import com.Sriram.AstrologyApp.client.ClientInfoCommandLineRunner;

@RestController
public class ClientInfoController {
	@Autowired
    private ClientInfoCommandLineRunner cmd ;
	
	@GetMapping("/astroapp/clientinfo")
	public List<ClientInfo> clientdetails(){
		return cmd.clientlist();
	}
	
	@GetMapping("/astroapp/clientname")
	public ClientInfo clientinfo() {
		return cmd.singleClientInfo();
	}
}
