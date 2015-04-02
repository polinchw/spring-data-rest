package com.earthlink.business.springdata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.earthlink.business.springdata.entities.Post;
/**
 * This Spring Data interface acts as the DAO.  There is no concrete
 * class visable to the programmer.
 * 
 * @author polinchakb
 *
 */
public interface PostRepository extends JpaRepository<Post, Integer> {
	
	Post findByPostId(Integer id);

}
