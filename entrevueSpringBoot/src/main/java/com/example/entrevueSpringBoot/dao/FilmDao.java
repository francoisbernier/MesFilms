package com.example.entrevueSpringBoot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entrevueSpringBoot.modele.Film;
/**
 * Classe représentant la couche DAO
 * @author francois bernier
 *
 */
@Repository
public interface FilmDao extends CrudRepository<Film, Long>  {

}
