package com.Sriram.Springboot_revision_August.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sriram.Springboot_revision_August.entity.HouseRent;

public interface HouseRentRepo extends JpaRepository<HouseRent, Integer> {
	

}
