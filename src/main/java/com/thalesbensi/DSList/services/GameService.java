package com.thalesbensi.DSList.services;


import com.thalesbensi.DSList.dto.GameDTO;
import com.thalesbensi.DSList.dto.GameMinDTO;
import com.thalesbensi.DSList.entities.Game;
import com.thalesbensi.DSList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> dto = gameRepository.findAll();
        return dto.stream().map(x -> new GameMinDTO(x)).toList();//Converte o tipo Games para DTO
    }

    @Transactional(readOnly = true)
    public GameDTO findbyId(Long id){
       Game item = gameRepository.findById(id).get();
        return new GameDTO(item);
    }

}
