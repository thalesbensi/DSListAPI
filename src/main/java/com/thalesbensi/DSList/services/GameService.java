package com.thalesbensi.DSList.services;


import com.thalesbensi.DSList.dto.GameMinDTO;
import com.thalesbensi.DSList.entities.Game;
import com.thalesbensi.DSList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> dto = gameRepository.findAll();
        return dto.stream().map(x -> new GameMinDTO(x)).toList();//Converte o tipo Games para DTO

    }

}
