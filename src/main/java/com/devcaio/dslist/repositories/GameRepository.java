package com.devcaio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcaio.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
