package com.thalesbensi.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thalesbensi.DSList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
