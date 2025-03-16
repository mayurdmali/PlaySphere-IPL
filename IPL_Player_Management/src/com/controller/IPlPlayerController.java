package com.controller;

import java.util.Set;
import com.entity.Player;
import com.service.IPLPlayerService;

public class IPlPlayerController {
	IPLPlayerService service = null;

	public Set<Player> getAllPlayersController() {
		service = new IPLPlayerService();

		Set<Player> db = service.getAllPlayersService();

		return db;

	}

	public Set<Player> getCSKPlayersController() {
		service = new IPLPlayerService();

		Set<Player> db1 = service.getCSKPlayers();

		return db1;

	}

	public Set<Player> getMIPlayersController() {
		service = new IPLPlayerService();

		Set<Player> db2 = service.getMIPlayers();

		return db2;

	}

	public Set<Player> getRCBPlayersController() {
		service = new IPLPlayerService();

		Set<Player> db3 = service.getRCBPlayers();

		return db3;

	}

	public Set<Player> getMostRunsPlayer() {
		service = new IPLPlayerService();

		Set<Player> db4 = service.getMostRunsPlayer();

		return db4;
		
	}

	public Set<Player> getMostWicketsPlayer() {
		service = new IPLPlayerService();

		Set<Player> db5 = service.getMostWicketsPlayer();

		return db5;
		
	}

	public Set<Player> getLessWicketsPlayer() {
		service = new IPLPlayerService();

		Set<Player> db6 = service.getLessWicketsPlayer();

		return db6;
		
	}

	public Set<Player> getLeastRunsPlayer() {
		service = new IPLPlayerService();

		Set<Player> db7 = service.getLeastRunsPlayer();

		return db7;
		
	}
}