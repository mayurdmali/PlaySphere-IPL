package com.service;

import java.util.HashSet;
import java.util.Set;
import com.dao.IPlPlayerDao;
import com.entity.Player;

public class IPLPlayerService {
	IPlPlayerDao dao = null;

	public Set<Player> getAllPlayersService() {
		dao = new IPlPlayerDao();
		Set<Player> db = dao.getAllPlayers();
		return db;

	}

	public Set<Player> getCSKPlayers() {
		HashSet<Player> db1 = new HashSet<Player>();

		dao = new IPlPlayerDao();

		Set<Player> db = dao.getAllPlayers();

		for (Player player : db) {
			if (player.getTeamname().equalsIgnoreCase("CSK")) {
				System.out.println(player);

			}
		}
		return db1;
	}

	public Set<Player> getMIPlayers() {
		HashSet<Player> db2 = new HashSet<Player>();

		dao = new IPlPlayerDao();

		Set<Player> db = dao.getAllPlayers();

		for (Player player : db) {
			if (player.getTeamname().equalsIgnoreCase("MI")) {
				System.out.println(player);

			}
		}
		return db2;
	}

	public Set<Player> getRCBPlayers() {
		HashSet<Player> db3 = new HashSet<Player>();

		dao = new IPlPlayerDao();

		Set<Player> db = dao.getAllPlayers();

		for (Player player : db) {
			if (player.getTeamname().equalsIgnoreCase("RCB")) {
				System.out.println(player);

			}
		}
		return db3;
	}

	public Set<Player> getMostRunsPlayer() {
		HashSet<Player> db4 = new HashSet<Player>();

		dao = new IPlPlayerDao();

		Set<Player> db = dao.getAllPlayers();

		for (Player player : db) {
			if(player.getRuns()> 7000) {
				System.out.println(player);
			}
		}
		return db4;
	}

	public Set<Player> getMostWicketsPlayer() {
		HashSet<Player> db5 = new HashSet<Player>();

		dao = new IPlPlayerDao();

		Set<Player> db = dao.getAllPlayers();

		for (Player player : db) {
			if(player.getWickets()>14) {
				System.out.println(player);
			}
		}
		return db5;
	}

	public Set<Player> getLessWicketsPlayer() {
		HashSet<Player> db6 = new HashSet<Player>();

		dao = new IPlPlayerDao();

		Set<Player> db = dao.getAllPlayers();

		for (Player player : db) {
			if(player.getWickets() < 2) {
				System.out.println(player);
			}
		}
		return db6;
	}

	public Set<Player> getLeastRunsPlayer() {
		HashSet<Player> db7 = new HashSet<Player>();

		dao = new IPlPlayerDao();

		Set<Player> db = dao.getAllPlayers();

		for (Player player : db) {
			if(player.getRuns() < 2000) {
				System.out.println(player);
			}
		}
		return db7;
	}
}
