package edu.cuny.brooklyn.cisc3120.web.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.cuny.brooklyn.cisc3120.web.model.GameStat;


public interface GameStatRepository extends CrudRepository<GameStat, String> {
    public List<GameStat> findAll();
}
