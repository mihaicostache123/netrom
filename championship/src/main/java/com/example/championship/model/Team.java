package com.example.championship.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int team_id;

    @Column(name = "TEAM_NAME")
    private String team_name;

    @OneToMany(mappedBy = "team")
    private List<Player> players = new ArrayList<>();

    @OneToMany(mappedBy = "team1")
    private List<Game> games_home = new ArrayList<>();

    @OneToMany(mappedBy = "team2")
    private List<Game> games_away = new ArrayList<>();

    @OneToMany(mappedBy = "team")
    private List<Sponsor> sponsors = new ArrayList<>();

    @OneToMany(mappedBy = "team")
    private List<Coach> coaches = new ArrayList<>();
}
