package com.devcaio.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devcaio.dslist.dto.GameDTO;
import com.devcaio.dslist.dto.GameListDTO;
import com.devcaio.dslist.dto.GameMinDTO;
import com.devcaio.dslist.entities.Game;
import com.devcaio.dslist.entities.GameList;
import com.devcaio.dslist.repositories.GameListRepository;
import com.devcaio.dslist.repositories.GameRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;

	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();

	}

}
