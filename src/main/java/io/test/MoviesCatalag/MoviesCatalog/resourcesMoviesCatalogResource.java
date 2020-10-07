package io.test.MoviesCatalag.MoviesCatalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class resourcesMoviesCatalogResource {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/movies/{movieId}")
	public MovieInfo getMovieById(@PathVariable("movieId") String id) {
		//test kiuuuuu ssssss
		return restTemplate.getForObject("http://Movies-Info/movieInfo/1", MovieInfo.class);
		
	}
	
	@PostMapping("/register")
	public void register(@RequestBody RegisterForm regForm,BindingResult bindingResult) {
		
		System.out.println(regForm.getFirstName());
		
	}

}
