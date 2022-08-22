package com.mkj.movieapp.catalog.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mkj.movieapp.catalog.dao.CatalogDB;
import com.mkj.movieapp.catalog.model.Catalog;

@RestController
@RequestMapping("/api/catalog")
public class CatalogService {
	
	@Autowired
	CatalogDB catalogDb;
	
	@GetMapping("/movies/{userId}")
	public List<Integer> getMoviesByUserId(@PathVariable int userId)
	{
		return catalogDb.getMoviesByUserId(userId);
	}
	@GetMapping("/list")
	public List<Catalog> getAllCatalog()
	{
		return catalogDb.getAllcatalog();
	}
	@GetMapping("/users/{movieId}")
	public List<Integer> getUsersBasedOnMovieId(@PathVariable int movieId)
	{
		return catalogDb.getUsersByMovieId(movieId);
	}
	
}
