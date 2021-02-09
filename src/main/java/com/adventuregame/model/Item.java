package com.adventuregame.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //auto generated id

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @ManyToMany(mappedBy = "itemList")
    private List<BaseCharacter> baseCharacterList;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<BaseCharacter> getBaseCharacterList() {
        return baseCharacterList;
    }

    public void setBaseCharacterList(List<BaseCharacter> baseCharacterList) {
        this.baseCharacterList = baseCharacterList;
    }
}
