package model;

import javax.persistence.*;
import javax.swing.*;
import java.util.List;

@Entity
@Table(name = "base_characters")
public class BaseCharacter implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

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


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "basecharacter")
    private List<Follower> followerList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "basecharacter")
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