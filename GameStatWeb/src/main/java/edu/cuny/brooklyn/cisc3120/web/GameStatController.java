package edu.cuny.brooklyn.cisc3120.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cuny.brooklyn.cisc3120.web.model.GameStat;
import edu.cuny.brooklyn.cisc3120.web.service.GameStatService;

@Controller
@RequestMapping("/gameStat")
public class GameStatController {
	@Autowired
	private GameStatService service ;
	
	@PostMapping("/save")
    public String saveStat(@RequestParam("numOfTargetsShot")String numofShot,
    		@RequestParam("numOfShotsFired") String shotsFired, @RequestParam("numOfTargetsMade") String targets, 
    		@RequestParam("numOfRoundsWon") String roundsWon, @RequestParam("numOfRoundsPlayed") String roundsPlayed,
    		@RequestParam("accuracy") String accuracy) {
		System.out.println("Saving the stat");
		GameStat stat = new GameStat();
		
		stat.setNumOfRoundsPlayed(Integer.parseInt(roundsPlayed));
		stat.setNumOfRoundsWon(Integer.parseInt(roundsWon));
		stat.setNumOfShotsFired(Integer.parseInt(shotsFired));
		stat.setNumOfTargetsMade(Integer.parseInt(targets));
		stat.setNumOfTargetsShot(Integer.parseInt(numofShot));
		stat.setAccuracy(Double.parseDouble(accuracy));
		
		service.saveStat(stat);
		return "redirect:gameStat/view";
    }
	
	@RequestMapping("/view")
    public String viewStat(Model model) {
        List<GameStat> stats = service.getStat();
        model.addAttribute("stats", stats);
        return "viewStat"; 
    }
}
