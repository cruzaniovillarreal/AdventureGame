package com.adventuregame.model;


import javax.persistence.*;

@Entity
@Table(name = "follower")
public class Follower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //auto generated id

    @ManyToOne
    @JoinColumn(name = "base_character_id")
    private BaseCharacter baseCharacter;



}
