package com.example.championship.controller;

import com.example.championship.model.Game;
import com.example.championship.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameservice;

    @GetMapping("/all")
    public List<Game> getAllGames() {
        return gameservice.getAllGames();
    }

    @PostMapping("/addGame")
    public void addGame(@RequestBody Game game) { gameservice.addGame(game); }

    @PutMapping("/updateGame")
    public void updateGame(@RequestBody Game game) { gameservice.updateGame(game); }

    @DeleteMapping("/deleteGame")
    public void deleteGame(@RequestBody Game game) { gameservice.deleteGame(game); }
}
