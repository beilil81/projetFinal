package com.tablet.bmf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tablet.bmf.entities.User;
/**
 * 
 * @author BMF
 *  Utilisation de spring data
 */
public interface IUserRepository extends JpaRepository<User, Long> {
      
}
