package com.example.championship.service;

import com.example.championship.model.Game;
import com.example.championship.model.Player;
import com.example.championship.model.Team;
import com.example.championship.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamrepository;

    public List<Team> getAllTeams(){
        return teamrepository.findAll();
    }

    public void addTeam(Team team) { teamrepository.save(team); }
    public void updateTeam(Team team) { teamrepository.save(team); }
    public void deleteTeam(Team team) { teamrepository.delete(team); }
}
