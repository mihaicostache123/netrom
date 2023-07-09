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
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int coach_id;

    @Column(name = "COACH_NAME")
    private String coach_name;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;
}
