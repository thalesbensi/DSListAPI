package com.thalesbensi.DSList.controllers;

import com.thalesbensi.DSList.dto.GameListDTO;
import com.thalesbensi.DSList.dto.GameMinDTO;
import com.thalesbensi.DSList.projections.GameMinProjection;
import com.thalesbensi.DSList.services.GameListService;
import com.thalesbensi.DSList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameListDTO findbyId(@PathVariable Long id){
        return gameListService.findbyId(id);
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        return gameService.findByList(listId);
    }
}
