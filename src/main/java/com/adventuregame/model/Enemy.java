package com.adventuregame.model;

import javax.persistence.*;

@Entity
@Table(name = "enemy")
public class Enemy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "enemy_type_id")
    private EnemyType enemyType;

    public Enemy() {}

    public Enemy(long id, String name, EnemyType enemyType) {
        this.id = id;
        this.name = name;
        this.enemyType = enemyType;
    }

    public Enemy(String name, EnemyType enemyType) {
        this.name = name;
        this.enemyType = enemyType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnemyType getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(EnemyType enemyType) {
        this.enemyType = enemyType;
    }
}
