package com.example.portfolioapi.repository;

import com.example.portfolioapi.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {
}
