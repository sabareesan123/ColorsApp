package com.sierraone.javaapp.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sierraone.javaapp.entities.Colors;


public interface ColorsRepository extends JpaRepository<Colors, Integer> {
	Optional<Colors> findByColor(String username);
}
