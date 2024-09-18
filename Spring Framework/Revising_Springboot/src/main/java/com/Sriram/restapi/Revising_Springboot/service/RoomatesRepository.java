package com.Sriram.restapi.Revising_Springboot.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sriram.restapi.Revising_Springboot.entity.Roomates;

@Repository
public interface RoomatesRepository extends JpaRepository<Roomates, Integer> {
                 
}
