package com.org.dxc.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="match_details")
public class MatchDetails 
{
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	private int matchId;
	private String teamOne;
	private String teamTwo;
	private String date;
	private String time;
	private String stadium;
	private String winner;
	private String status;
	private String delay;
	@OneToOne(cascade = CascadeType.ALL)
	private BiddingDetails bid;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "matchId")
	private List<BiddingDetails> biddingMatchId;
	public MatchDetails()
	{
		
	}
	
	public MatchDetails(int matchId, String teamOne, String teamTwo, String date, String time, String stadium,
			String winner, String status, String delay) {
		super();
		this.matchId = matchId;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.date = date;
		this.time = time;
		this.stadium = stadium;
		this.winner = winner;
		this.status = status;
		this.delay = delay;
	}

	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDelay() {
		return delay;
	}
	public void setDelay(String delay) {
		this.delay = delay;
	}
	
}
