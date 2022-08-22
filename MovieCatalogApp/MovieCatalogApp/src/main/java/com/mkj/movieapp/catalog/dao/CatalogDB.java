package com.mkj.movieapp.catalog.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mkj.movieapp.catalog.model.Catalog;

@Component
public class CatalogDB {

	List<Catalog> allcatalog = new ArrayList<>();
	
	public CatalogDB() {
		allcatalog = FileReadingService.allCatalog;
	}
	
	
	public List<Catalog> getAllcatalog() {
		return allcatalog;
	}


	public List<Integer> getMoviesByUserId(int searchedUserId)
	{
		List<Integer> moviesByUserId = new ArrayList<>();
		
		for (Catalog data : allcatalog) {
			if(data.getUserId() == searchedUserId)
			{
				moviesByUserId.add(data.getMovieId());
			}
		}
		if(moviesByUserId.size()>0)	return moviesByUserId;
		else return null;
		
	}
	
	public List<Integer> getUsersByMovieId(int searchedMovieId)
	{
		List<Integer> usersByMovie = new ArrayList<>();
		
		for (Catalog data : allcatalog) {
			if(data.getMovieId() == searchedMovieId)
			{
				usersByMovie.add(data.getUserId());
			}
		}
		if(usersByMovie.size()>0)	return usersByMovie;
		else return null;
		
	}
	
	
	
}
