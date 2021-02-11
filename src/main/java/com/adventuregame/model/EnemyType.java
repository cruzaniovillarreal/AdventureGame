package com.adventuregame.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "enemy_type")
public class EnemyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String type;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "enemyType")
    private List<Enemy> enemyList;

    public EnemyType(){}

    public EnemyType(long id, String type, List<Enemy> enemyList) {
        this.id = id;
        this.type = type;
        this.enemyList = enemyList;
    }

    public EnemyType(String type, List<Enemy> enemyList) {
        this.type = type;
        this.enemyList = enemyList;
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
