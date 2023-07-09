package com.example.championship.repository;


import com.example.championship.model.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachRepository extends JpaRepository <Coach, Integer> {

}
