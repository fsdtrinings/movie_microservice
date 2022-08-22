package com.mkj.movieapp.catalog.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import com.mkj.movieapp.catalog.model.Catalog;

@Component
public class FileReadingService {
	
	
	public static List<Catalog> allCatalog = new ArrayList<>();
	
	static {
	
		try {
			
			File f = ResourceUtils.getFile("classpath:MovieInfo.txt");
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = "";
			while((line = br.readLine())!=null)
			{
				String arr[] = line.split(" ");
				int movieId = Integer.parseInt(arr[0]);
				int userId =  Integer.parseInt(arr[1]);
				
				Catalog catalog = new Catalog(userId, movieId);
				allCatalog.add(catalog);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
		
				
		
	}

}
