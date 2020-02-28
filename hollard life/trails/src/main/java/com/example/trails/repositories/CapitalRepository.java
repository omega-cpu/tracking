package com.example.trails.repositories;

import com.example.trails.models.Capital;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CapitalRepository extends JpaRepository<Capital, Integer> {
    
}