package com.devcaio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcaio.dslist.entities.Game;
import com.devcaio.dslist.entities.GameList;

public interface GameRepository extends JpaRepository<Game, Long>{

}
