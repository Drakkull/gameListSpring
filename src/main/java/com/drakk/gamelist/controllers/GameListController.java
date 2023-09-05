package com.drakk.gamelist.controllers;

import com.drakk.gamelist.dto.GameListDTO;
import com.drakk.gamelist.dto.GameMinDTO;
import com.drakk.gamelist.services.GameListService;
import com.drakk.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;



    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;

    }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;

    }
    //updating
}
