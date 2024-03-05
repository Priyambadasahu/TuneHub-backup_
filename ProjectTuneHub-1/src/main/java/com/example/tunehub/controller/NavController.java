package com.example.tunehub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NavController {

	@GetMapping("/login")
	public String login()
	{
		return "login";

	}

	@GetMapping("/registration")
	public String registration() {
		return "registration";
	}

	@GetMapping("/newsong")
	public String newsong()
	{
		return "newsong";

	}

}











/*
 * <!DOCTYPE html> <html> <head> <head> List of songs </head> </head> <body>
 * <table border="1"> <thead> <tr> <th>Name</th> <th>Artist</th> <th>Genere</th>
 * <th>Play</th> </tr> </thead> <tbody> <tr th:each="songs:${songs}"> <td
 * th:text="${songs.name}"></td> <td th:text="${songs.artist}">
 * </tdth:text="${songs.name}"> <td th:text="${songs.genre}"></td> <td><audio
 * controls> <source th:src="${songs.link}"> </audio> </td> </tr> </tbody>
 * </table> </body> </html>
 */
