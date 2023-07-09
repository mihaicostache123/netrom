package com.example.championship.repository;


import com.example.championship.model.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorRepository extends JpaRepository <Sponsor, Integer> {
}
