package com.thalesbensi.DSList.controllers;

import com.thalesbensi.DSList.dto.GameListDTO;
import com.thalesbensi.DSList.services.GameListService;
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

    @GetMapping
    public List<GameListDTO> findAll(){
       return gameListService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameListDTO findbyId(@PathVariable Long id){
        return gameListService.findbyId(id);
    }

}
