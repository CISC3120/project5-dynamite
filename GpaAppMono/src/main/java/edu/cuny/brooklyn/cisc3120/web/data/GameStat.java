package edu.cuny.brooklyn.cisc3120.web.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@Document
public class GameStat {
	@Id
	private String statId;
    private int numOfTargetsShot;
    private int numOfShotsFired;
    private int numOfTargetsMade;
    private int numOfRoundsWon;
    private int numOfRoundsPlayed;
    private double accuracy;
	public String getStatId() {
		return statId;
	}
	public void setStatId(String statId) {
		this.statId = statId;
	}
	public int getNumOfTargetsShot() {
		return numOfTargetsShot;
	}
	public void setNumOfTargetsShot(int numOfTargetsShot) {
		this.numOfTargetsShot = numOfTargetsShot;
	}
	public int getNumOfShotsFired() {
		return numOfShotsFired;
	}
	public void setNumOfShotsFired(int numOfShotsFired) {
		this.numOfShotsFired = numOfShotsFired;
	}
	public int getNumOfTargetsMade() {
		return numOfTargetsMade;
	}
	public void setNumOfTargetsMade(int numOfTargetsMade) {
		this.numOfTargetsMade = numOfTargetsMade;
	}
	public int getNumOfRoundsWon() {
		return numOfRoundsWon;
	}
	public void setNumOfRoundsWon(int numOfRoundsWon) {
		this.numOfRoundsWon = numOfRoundsWon;
	}
	public int getNumOfRoundsPlayed() {
		return numOfRoundsPlayed;
	}
	public void setNumOfRoundsPlayed(int numOfRoundsPlayed) {
		this.numOfRoundsPlayed = numOfRoundsPlayed;
	}
	public double getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}
}
