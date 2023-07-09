package com.example.championship.controller;


import com.example.championship.model.Coach;
import com.example.championship.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coach")
public class CoachController {
    @Autowired
    private CoachService coachservice;

    @GetMapping("/all")
    public List<Coach> getAllCoaches() { return coachservice.getAllCoaches(); }

    @PostMapping("/addCoach")
    public void addCoach(Coach coach) { coachservice.addCoach(coach); }

    @PutMapping("/updateCoach")
    public void updateCoach(Coach coach) { coachservice.updateCoach(coach); }

    @DeleteMapping("/deleteCoach")
    public void deleteCoach(Coach coach) { coachservice.deleteCoach(coach); }
}
