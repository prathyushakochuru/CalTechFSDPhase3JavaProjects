package com.app.test.Serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.app.model.Player;
import com.app.service.PlayerService;
import com.app.serviceImpl.PlayerServiceImpl;

public class PlayerServiceImplTest {
	
	private static PlayerService service;
	
	@BeforeAll
	public static void createPlayers()
	{
		service = new PlayerServiceImpl();
		
		List<Player> playerlist = new ArrayList<>();
		
		playerlist.add(new Player(1, "Neena", 32));
		playerlist.add(new Player(2, "Prathyusha", 32));
		playerlist.add(new Player(3, "Harsha", 35));
		playerlist.add(new Player(4, "Naga", 38));
		playerlist.add(new Player(5, "Aarush", 1));
		playerlist.add(new Player(6, "Ved", 1));
		
		PlayerServiceImpl.playerList = playerlist;
		
	}
	
	@Test
	void testgetPlayerByIdforValid()
	{
		int id = 2;
		
		Player player = new Player(2, "Prathyusha", 32);
		
		Assertions.assertEquals(player, service.getPlayerById(id));
	}
	
	@Test
	void testgetPlayerByIDforInvalid()
	{
		int id = 1000;
		Assertions.assertEquals(null, service.getPlayerById(id));
	}
	
	@Test
	void testgetPlayerByAgeforValid()
	{
		int age = 32;
		
		//Player player = new Player(2, "Prathyusha", 32);
		
		Assertions.assertEquals(2, service.getPlayersByAge(age));
	}
	
	@Test
	void testgetPlayerByAgeforInvalid()
	{
		int age = 1000;
		Assertions.assertEquals(null, service.getPlayersByAge(age));
	}

}
