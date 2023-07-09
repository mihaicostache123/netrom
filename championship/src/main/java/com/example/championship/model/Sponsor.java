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
@NoArgsConstructor
@AllArgsConstructor
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sponsor_id;

    @Column(name = "SPONSOR_NAME")
    private String sponsor_name;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "team_sponsor")
    private Team team;
}
