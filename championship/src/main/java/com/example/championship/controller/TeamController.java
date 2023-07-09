package com.example.championship.controller;

import com.example.championship.model.Game;
import com.example.championship.model.Player;
import com.example.championship.model.Team;
import com.example.championship.service.PlayerService;
import com.example.championship.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Autowired
    private TeamService teamservice;

    @GetMapping("/all")
    public List<Team> getAllTeams()
    {
        return teamservice.getAllTeams();
    }

    @PostMapping("/addTeam")
    public void addteam(@RequestBody Team team) { teamservice.addTeam(team); }

    @PutMapping("/updateTeam")
    public void updateteam(@RequestBody Team team) { teamservice.updateTeam(team); }

    @DeleteMapping("/deleteTeam")
    public void deleteteam(@RequestBody Team team) { teamservice.deleteTeam(team); }
}