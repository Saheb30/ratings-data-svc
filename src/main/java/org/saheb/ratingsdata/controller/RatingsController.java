package org.saheb.ratingsdata.controller;

import org.saheb.ratingsdata.model.Rating;
import org.saheb.ratingsdata.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsController {
	@RequestMapping("/movies/{movieId}")
	public Rating getMovieRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}

	@RequestMapping("/user/{userId}")
	public UserRating getUserRatings(@PathVariable("userId") String userId) {
		System.out.println("inside rating");
		UserRating userRating = new UserRating();
		userRating.initData(userId);
		return userRating;

	}

}
