package com.tablet.bmf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tablet.bmf.entities.Categorie;

/**
 * 
 * @author BMF utilisation de spring data
 *
 */
public interface ICategorieRepository extends JpaRepository<Categorie, Long> {
      
}
