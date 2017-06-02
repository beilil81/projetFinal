package com.tablet.bmf.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 * @author bmf
 *
 */

@Entity
public class LigneCommande implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLigneCommande;
	@ManyToOne
	@JoinColumn(name = "idProduit")
	private Produit produit;
	private int quantite;
	private double prix;
	@ManyToOne
	@JoinColumn(name = "idCommande")
	private Commande commande;

	/**
	 * 
	 * @return id de LigneCommande
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public LigneCommande() {
		super();
	}

	public LigneCommande(int quantite, double prix) {
		super();
		this.quantite = quantite;
		this.prix = prix;
	}

}