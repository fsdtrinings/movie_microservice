package com.mkj.movieapp.review.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.mkj.movieapp.review.model.Review;


@Component
public class FileReadingService {
	
	
	public static List<Review> allReviews = new ArrayList<>();
	
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
				float ratings = Float.parseFloat(arr[2]);
				String comments = (arr.length == 4) ? arr[3] : null;
				
				Review review = new Review(movieId, userId, ratings, comments);
				System.out.println(" -->> "+review);
				allReviews.add(review);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
		
				
		
	}

}
