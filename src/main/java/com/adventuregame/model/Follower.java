package com.adventuregame.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "follower")
public class Follower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //auto generated id

    @ManyToMany(mappedBy = "followerList")
    private List<BaseCharacter> baseCharacterList;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<BaseCharacter> getBaseCharacterList() {
        return baseCharacterList;
    }

    public void setBaseCharacterList(List<BaseCharacter> baseCharacterList) {
        this.baseCharacterList = baseCharacterList;
    }
}
