package com.Sriram_learning.Crircket;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PlayerRecord {
    private CricketPlayerInfo playerinfo;
    
    public PlayerRecord (CricketPlayerInfo playerinfo) {
    	this.playerinfo= playerinfo ;
    }
    
    public void palyerdetails() {
    	System.out.println("Country : " + playerinfo.country());
    	System.out.println("Name : " + playerinfo.name());
    	System.out.println("Player Style : " + playerinfo.playerstayle());
    	System.out.println("Highest Score : " + playerinfo.highestscore());
    	System.out.println("Average : " + playerinfo.average());
    }
}
