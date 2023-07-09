package com.example.championship.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int game_id;

    @Column(name = "SCORE_1")
    private int score_1;

    @Column(name = "SCORE_2")
    private int score_2;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "team_id1", nullable = false)
    private Team team1;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "team_id2", nullable = false)
    private Team team2;

}
