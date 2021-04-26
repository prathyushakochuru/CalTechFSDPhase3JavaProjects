package com.app.service;

import java.util.List;

import com.app.model.Player;

public interface PlayerService {

	public Player getPlayerById(int id);
	public List<Player> getPlayersByAge(int age);
}
