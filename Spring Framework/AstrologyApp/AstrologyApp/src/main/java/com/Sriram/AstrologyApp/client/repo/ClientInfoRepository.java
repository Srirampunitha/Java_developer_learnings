package com.Sriram.AstrologyApp.client.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sriram.AstrologyApp.client.ClientInfo;

public interface ClientInfoRepository extends JpaRepository<ClientInfo, Long> {
   
	public  ClientInfo findByName(String name) ;
	public ClientInfo findByPlace(String Place); 
}
