package com.dao;

import java.util.HashSet;
import java.util.Set;

import com.entity.Player;

public class IPlPlayerDao {
	
	public Set<Player>getAllPlayers(){
		
		HashSet <Player> db = new HashSet<Player>();
		db.add(new Player(7, "MSD", 5000, 1, "CSK" ));
		db.add(new Player(3, "Raina", 5500, 2, "CSK" ));
		db.add(new Player(99, "Jadeja", 4200, 3, "CSK" ));
		db.add(new Player(31, "Rayudu", 4000, 4, "CSK" ));
		db.add(new Player(8, "Deepak", 1500, 5, "CSK" ));
		
		db.add(new Player(45, "Rohit", 6000, 6, "MI" ));
		db.add(new Player(33, "Bumrah", 2500, 7, "MI" ));
		db.add(new Player(72, "Surya", 3800, 8, "MI" ));
		db.add(new Player(9, "Hardik", 2000, 9, "MI"  ));
		db.add(new Player(97, "Pollard", 3900, 10, "MI" ));
		
		db.add(new Player(18, "Virat", 7500, 11, "RCB" ));
		db.add(new Player(17, "ABD", 4800, 12, "RCB" ));
		db.add(new Player(96, "Maxwell", 4200, 13, "RCB"  ));
		db.add(new Player(86, "DK", 3000, 14, "RCB"  ));
		db.add(new Player(11, "Siraj", 2200, 15, "RCB"  ));
		
		
		return db;
		
	}
	

}
