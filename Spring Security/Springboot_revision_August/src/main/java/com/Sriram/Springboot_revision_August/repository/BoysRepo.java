package com.Sriram.Springboot_revision_August.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sriram.Springboot_revision_August.entity.Boys;

public interface BoysRepo extends JpaRepository<Boys, Integer> {
     public List<Boys> findByUsername(String username);
}
