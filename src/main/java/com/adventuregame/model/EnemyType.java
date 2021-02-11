package com.adventuregame.model;

import javax.persistence.*;

@Entity
@Table(name = "enemy_type")
public class EnemyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String type;

    public EnemyType(){}

    public EnemyType(long id, String type) {
        this.id = id;
        this.type = type;
    }

    public EnemyType(String type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
