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
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int player_id;

    @Column(name = "PLAYER_NAME")
    private String player_name;

    @Column(name = "AGE")
    private int player_age;

    @Column(name = "POSITION")
    private String position;

    @Column(name = "JERSEY_NUMBER")
    private int jersey_number;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

}
