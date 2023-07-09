package com.example.championship.service;

import com.example.championship.model.Game;
import com.example.championship.model.Player;
import com.example.championship.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerrepository;

    public List<Player> getAllPlayers(){
        return playerrepository.findAll();
    }

    public void addPlayer(Player player)
    {
        playerrepository.save(player);
    }
    public void updatePlayer(Player player)
    {
        playerrepository.save(player);
    }
    public void deletePlayer(Player player)
    {
        playerrepository.delete(player);
    }
}
