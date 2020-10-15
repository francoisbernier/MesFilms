/**
 * 
 */
package com.example.entrevueSpringBoot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entrevueSpringBoot.modele.Film;
import com.example.entrevueSpringBoot.service.FilmService;

/**
 * Classe représentant le controlleur du film
 * @author francois bernier
 *
 */
@RequestMapping("api/film")
@RestController
public class FilmController {
	
	
	private final FilmService filmService;
	
	@Autowired
	public FilmController(FilmService filmService) {
		this.filmService = filmService;
	}
	
	@PostMapping
	public Film ajouterFilm(@RequestBody Film film) {
		return filmService.ajouterFilm(film);
	}
	
	@GetMapping(path = "{id}")
	public Film obtenirFilm(@PathVariable("id") long id) {
		return filmService.obtenirFilm(id)
				.orElse(null);
	}

}
