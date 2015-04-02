package com.earthlink.business.springdata.rest;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.earthlink.business.springdata.entities.Post;
import com.earthlink.business.springdata.repositories.PostRepository;

/**
 * This is a Spring Restful web service.
 * 
 * @author polinchakb
 *
 */
@RestController
@RequestMapping("/restService")
public class PostRestService {
	
	private final static Logger logger = Logger.getLogger(PostRestService.class.getName());
	
	@Autowired
	PostRepository dao;
	
	@RequestMapping("/post")
    public String getPostById(@RequestParam(value="id") String id) {
		logger.info("getPostById invoked id="+id);
		Post post = dao.findByPostId(Integer.parseInt(id));
        return post.getTitle();
    }
	
	@RequestMapping("/fullPost")
    public Post getPostFullById(@RequestParam(value="id") String id) {
		logger.info("getPostById invoked id="+id);
		Post post = dao.findByPostId(Integer.parseInt(id));
        return post;
    }

}
