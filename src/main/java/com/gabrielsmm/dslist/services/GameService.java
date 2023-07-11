package com.gabrielsmm.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.gabrielsmm.dslist.dto.GameMinDTO;
import com.gabrielsmm.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	private GameRepository gameRepository;
	
	public GameService(GameRepository gameRepository) {
		this.gameRepository = gameRepository;
	}

	public List<GameMinDTO> findAll() {
		return gameRepository.findAll().stream().map(GameMinDTO::new).collect(Collectors.toList());
	}
	
}
