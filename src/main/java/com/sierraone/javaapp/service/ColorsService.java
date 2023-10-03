package com.sierraone.javaapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sierraone.javaapp.entities.Colors;
import com.sierraone.javaapp.entities.Votes;
import com.sierraone.javaapp.repos.ColorsRepository;
import com.sierraone.javaapp.repos.VotesRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ColorsService {
	
	private final ColorsRepository colorsRepository;
	

	private final VotesRepository votesRepository;

	

	public List<Colors> get() {
		
		return colorsRepository.findAll();
	}

	public List<Votes> getVotes(String color) {
		
		return votesRepository.findByColor(color);
	}

}
