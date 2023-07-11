package com.gabrielsmm.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielsmm.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
