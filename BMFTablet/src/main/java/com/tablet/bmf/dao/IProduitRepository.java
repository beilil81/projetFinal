package com.tablet.bmf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tablet.bmf.entities.Produit;

public interface IProduitRepository extends JpaRepository<Produit, Long> {

}
