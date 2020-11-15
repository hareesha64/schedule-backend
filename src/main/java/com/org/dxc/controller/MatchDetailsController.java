package com.org.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.dxc.model.MatchDetails;

import com.org.dxc.service.MatchDetailsService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200")
public class MatchDetailsController {
	
	@Autowired
	MatchDetailsService service;
	
	@GetMapping("/match")
	public List<MatchDetails> getMatches(){
		return service.getAllMatches();
		
	}
	@GetMapping("/match/{id}")
	public MatchDetails getMatchById(@PathVariable int id) {
		return service.MatchById(id);
	}
	@PutMapping("/match")
	public MatchDetails updateTeam(@RequestBody MatchDetails t) {
		return service.updateMatch(t);
		
	}
}