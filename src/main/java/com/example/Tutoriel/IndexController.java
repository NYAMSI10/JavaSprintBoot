package com.example.Tutoriel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@GetMapping("/")
	public Utilisateur index()
	{
		
		Utilisateur utilisateur= new Utilisateur();
		utilisateur.setNom("brice");
		utilisateur.setPrenom("brice");
		return utilisateur;
	
		
		
	}
}
