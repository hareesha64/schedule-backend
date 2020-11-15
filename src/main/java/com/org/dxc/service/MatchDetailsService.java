package com.org.dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dxc.dao.MatchDetailsDao;
import com.org.dxc.model.MatchDetails;

@Service
public class MatchDetailsService {
	@Autowired
	MatchDetailsDao dao;
	public List<MatchDetails> getAllMatches() {
		
		return dao.findAll();
	}
	public MatchDetails MatchById(int id) {
		Optional<MatchDetails> match = dao.findById(id);
		return match.get();
		
	}

	public MatchDetails updateMatch(MatchDetails t) {
		
		Optional<MatchDetails> update =dao.findById(t.getMatchId());
		MatchDetails match = update.get();
		match.setDelay(t.getDelay());
		match.setWinner(t.getWinner());
		match.setStatus(t.getStatus());
		return dao.save(match);
	}

}
