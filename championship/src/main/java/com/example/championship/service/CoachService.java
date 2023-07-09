package com.example.championship.service;


import com.example.championship.model.Coach;
import com.example.championship.repository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoachService {
    @Autowired
    private CoachRepository coachrepository;

    public List<Coach> getAllCoaches() { return coachrepository.findAll(); }

    public void addCoach(Coach coach) { coachrepository.save(coach); }
    public void updateCoach(Coach coach) { coachrepository.save(coach); }
    public void deleteCoach(Coach coach) { coachrepository.delete(coach); }
}
