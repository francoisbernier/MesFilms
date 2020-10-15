/**
 * 
 */
package com.example.entrevueSpringBoot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entrevueSpringBoot.dao.FilmDao;
import com.example.entrevueSpringBoot.modele.Film;

/**
 * Classe représentant la classe de service du film
 * @author francois bernier
 *
 */@Service
public class FilmService {

	
	private final FilmDao filmRepository;
	
	@Autowired
	public FilmService(FilmDao filmRepository ) {
		this.filmRepository = filmRepository;
	}
	
	/**
	 * Méthode permettant d'ajouter un film
	 * @param film
	 * @return film
	 */
	public Film ajouterFilm(Film film) {
		return filmRepository.save(film);
	}
	/**
	 * 
	 * @param id - id du film
	 * @return Optional<Film> - le film retrouvé
	 */
	public Optional<Film> obtenirFilm(long id) {
		return filmRepository.findById(id);
	}
}
