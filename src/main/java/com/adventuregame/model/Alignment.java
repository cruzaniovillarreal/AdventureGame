package com.adventuregame.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "alignment")
public class Alignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String type;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alignment")
    private List<BaseCharacter> baseCharacterList;


    public Alignment(){}

    public Alignment(int id, String type, List<BaseCharacter> baseCharacterList){
        this.id = id;
        this.type = type;
        this.baseCharacterList = baseCharacterList;
    }

    public Alignment(String type, List<BaseCharacter> baseCharacterList){
        this.type = type;
        this.baseCharacterList = baseCharacterList;
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

    public List<BaseCharacter> getBaseCharacterList() {
        return baseCharacterList;
    }

    public void setBaseCharacterList(List<BaseCharacter> baseCharacterList) {
        this.baseCharacterList = baseCharacterList;
    }
}
