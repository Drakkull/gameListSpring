package com.drakk.gamelist.services;

import com.drakk.gamelist.dto.GameMinDTO;
import com.drakk.gamelist.entities.Game;
import com.drakk.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();

         return result.stream().map(x -> new GameMinDTO(x)).toList();


    }
}
