package com.example.saswuad.repository;

import com.example.saswuad.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository <Client,Long> {
    
}