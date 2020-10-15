
package com.example.entrevueSpringBoot.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;





/**
 * Classe représentant l'entite acteur du film
 * @author francois bernier
 *
 */
@Entity
public class Acteur {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
	@NotBlank
	private String nom;
	@NotBlank
	private String prenom;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
