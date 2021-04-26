package com.app.serviceImpl;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import com.app.model.Player;
import com.app.service.PlayerService;

public class PlayerServiceImpl implements PlayerService{

	public static List<Player> playerList;
	@Override
	public Player getPlayerById(int id) {
		Player player=null;
		try {
		player=playerList.stream().findFirst().filter(p->p.getId()==id).get();
		}catch(NoSuchElementException e) {
			
		}
		return player;
	}

	@Override
	public List<Player> getPlayersByAge(int age) {
		
		
		
		return playerList.stream().filter(p->p.getAge()==age).collect(Collectors.toList());
	}

}
