package com.devcaio.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devcaio.dslist.dto.GameDTO;
import com.devcaio.dslist.dto.GameListDTO;
import com.devcaio.dslist.dto.GameMinDTO;
import com.devcaio.dslist.entities.Game;
import com.devcaio.dslist.services.GameListService;
import com.devcaio.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;

	@GetMapping
	public List<GameListDTO> finAll() {
		var result = gameListService.findAll();
		return result;
	}

}
