package com.movieapp.service;

import java.util.Arrays;
import java.util.List;

public class MovieDetails {
	
	public List<String> showMovies(String language){
		List<String> movies =null;
		if(language != null) {
			
			if(language.equals("kannada")) {
				return  Arrays.asList("kantara","kgf","kgf2");
				
			}else if (language.equals("english")) {
				return  Arrays.asList("ironman","the dark knight","avatar");
			}else if (language.equals("hindi")) {
				return  Arrays.asList("jawan","janne jaan","kgf");
			}
		}
		
		return movies;
		
		
	}

}
