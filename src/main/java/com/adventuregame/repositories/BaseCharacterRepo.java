package com.adventuregame.repositories;

import com.adventuregame.model.BaseCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseCharacterRepo extends JpaRepository<BaseCharacter, Long> {
}
