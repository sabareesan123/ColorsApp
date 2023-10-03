package com.sierraone.javaapp.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sierraone.javaapp.entities.Votes;


public interface VotesRepository extends JpaRepository<Votes, Integer> {
	List<Votes> findByColor(String color);
}
