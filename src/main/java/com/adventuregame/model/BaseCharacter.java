package com.adventuregame.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "base_character")
public class BaseCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //auto generated id

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int life;

    @Column(nullable = false)
    private int fate;

    @Column(nullable = false)
    private int strength;

    @Column(nullable = false)
    private int craft;

    @Column(nullable = false)
    private int gold;

    @Column(nullable = false)
    private String image;

    @ManyToOne
    @JoinColumn(name = "alignment_id")
    private Alignment alignment;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "base_character_follower",
            joinColumns = {@JoinColumn(name = "base_character_id")},
            inverseJoinColumns = {@JoinColumn(name = "follower_id")}
    )
    private List<Follower> followerList;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "base_character_item",
            joinColumns = {@JoinColumn(name = "base_character_id")},
            inverseJoinColumns = {@JoinColumn(name = "item_id")}
    )
    private List<Item> itemList;


    public BaseCharacter() {
    }

    public BaseCharacter(long id, String name, int life, int fate, int strength, int craft, int gold, String image, Alignment alignment, List<Follower> followerList, List<Item> itemList) {
        this.id = id;
        this.name = name;
        this.life = life;
        this.fate = fate;
        this.strength = strength;
        this.craft = craft;
        this.gold = gold;
        this.image = image;
        this.alignment = alignment;
        this.followerList = followerList;
        this.itemList = itemList;
    }

    ;

    public BaseCharacter(String name, int life, int fate, int strength, int craft, int gold, String image, Alignment alignment, List<Follower> followerList, List<Item> itemList) {
        this.name = name;
        this.life = life;
        this.fate = fate;
        this.strength = strength;
        this.craft = craft;
        this.gold = gold;
        this.image = image;
        this.alignment = alignment;
        this.followerList = followerList;
        this.itemList = itemList;
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

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getFate() {
        return fate;
    }

    public void setFate(int fate) {
        this.fate = fate;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getCraft() {
        return craft;
    }

    public void setCraft(int craft) {
        this.craft = craft;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public List<Follower> getFollowerList() {
        return followerList;
    }

    public void setFollowerList(List<Follower> followerList) {
        this.followerList = followerList;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}