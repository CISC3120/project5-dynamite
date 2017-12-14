package edu.cuny.brooklyn.cisc3120.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cuny.brooklyn.cisc3120.web.data.GameStatRepository;
import edu.cuny.brooklyn.cisc3120.web.model.GameStat;

@Service
public class GameStatService {

	@Autowired
	private GameStatRepository repository;
	
	public void saveStat(GameStat stat) {
		repository.save(stat);
	}
	
	public List<GameStat> getStat() {
		return repository.findAll();
	}
}
