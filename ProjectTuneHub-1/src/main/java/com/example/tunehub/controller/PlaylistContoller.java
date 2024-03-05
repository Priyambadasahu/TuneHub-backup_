package com.example.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tunehub.entity.Playlist;
import com.example.tunehub.entity.Song;
import com.example.tunehub.service.PlaylistService;
import com.example.tunehub.service.SongService;


@Controller
public class PlaylistContoller
{
	@Autowired
	SongService songService;

	@Autowired
	PlaylistService  playlistService;

	@GetMapping("/createplaylists")
	public String createPlaylists(Model model)
	{
		List<Song> songList=songService.fetchAllSongs();
		model.addAttribute("songs", songList);
		//System.out.println(songList);
		return"createplaylists";
	}


	@PostMapping("/addplaylist")
	public String addPlaylists(@ModelAttribute Playlist playlist)
	{
		//Updating the playlist table
		playlistService.addplaylsit(playlist);
		//Updating the song table
		List<Song> songsList = playlist.getSongs();
		for (Song s : songsList) {
			s.getPlaylists().add(playlist);
			songService.updateSong(s);
		}
		return "adminhome";
	}


	@GetMapping("/viewplaylists")
	public String viewPlaylists(Model model)
	{

		List<Playlist> playlist=playlistService.fetchAllPlaylist();
		model.addAttribute("allplaylist",playlist);
		return "displayplaylist";	
	}
}


























