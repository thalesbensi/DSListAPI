package com.thalesbensi.DSList.services;


import com.thalesbensi.DSList.entities.Game;
import com.thalesbensi.DSList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll(){
        return gameRepository.findAll();
    }

}
