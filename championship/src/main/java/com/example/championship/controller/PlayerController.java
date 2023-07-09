package com.example.championship.controller;


import com.example.championship.model.Player;
import com.example.championship.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService playerservice;

    @GetMapping("/all")
    public List<Player> getAllPlayers() { return playerservice.getAllPlayers(); }

    @PostMapping("/addPlayer")
    public void addPlayer(@RequestBody Player player) { playerservice.addPlayer(player); }

    @PutMapping("/updatePlayer")
    public void updatePlayer(@RequestBody Player player) { playerservice.updatePlayer(player); }

    @DeleteMapping("/deletePlayer")
    public void deletePlayer(@RequestBody Player player) { playerservice.deletePlayer(player); }
}
