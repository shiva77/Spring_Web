package com.shiva.app.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

  /**
   * Method findByEmail
   * 
   * @param email the user email.
   * @return the user having the passed email or null if no user is found.
   */
  public User findByEmail(String email);

}