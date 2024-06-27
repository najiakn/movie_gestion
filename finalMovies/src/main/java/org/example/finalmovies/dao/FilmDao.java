package org.example.finalmovies.dao;

import org.example.finalmovies.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FilmDao extends JpaRepository<Film, Integer> {
Film findByTitre(String titre);
}
