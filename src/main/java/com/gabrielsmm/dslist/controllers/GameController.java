package com.gabrielsmm.dslist.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielsmm.dslist.dto.GameMinDTO;
import com.gabrielsmm.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	private GameService gameService;
	
	public GameController(GameService gameService) {
		this.gameService = gameService;
	}

	@GetMapping
	public ResponseEntity<List<GameMinDTO>> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return ResponseEntity.ok().body(result);
	}
	
}
