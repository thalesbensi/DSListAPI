package com.thalesbensi.DSList.repositories;

import com.thalesbensi.DSList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
