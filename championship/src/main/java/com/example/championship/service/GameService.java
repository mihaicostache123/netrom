package com.example.championship.service;

import com.example.championship.model.Game;
import com.example.championship.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gamerepository;

    public List<Game> getAllGames(){
        return gamerepository.findAll();
    }

    public void addGame(Game game)
    {
        gamerepository.save(game);
    }
    public void updateGame(Game game)
    {
        gamerepository.save(game);
    }
    public void deleteGame(Game game)
    {
        gamerepository.delete(game);
    }
}
