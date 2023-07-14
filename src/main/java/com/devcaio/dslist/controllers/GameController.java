package com.devcaio.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devcaio.dslist.dto.GameDTO;
import com.devcaio.dslist.dto.GameMinDTO;
import com.devcaio.dslist.entities.Game;
import com.devcaio.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	
	@GetMapping(value = "/{id}")
	public GameDTO finById(@PathVariable Long id){
		var result = gameService.findById(id);
		return result;
	}
	
	@GetMapping
	public List<GameMinDTO> finAll(){
		var result = gameService.findAll();
		return result;
	}
	
	
	
	
	
	
}
