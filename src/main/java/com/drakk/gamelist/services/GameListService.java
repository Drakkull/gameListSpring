package com.drakk.gamelist.services;

import com.drakk.gamelist.dto.GameDTO;
import com.drakk.gamelist.dto.GameListDTO;
import com.drakk.gamelist.dto.GameMinDTO;
import com.drakk.gamelist.entities.Game;
import com.drakk.gamelist.entities.GameList;
import com.drakk.gamelist.repositories.GameListRepository;
import com.drakk.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;



    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();

        return result.stream().map(x -> new GameListDTO(x)).toList();


    }

}
