package com.example.tunehub.service;

import java.util.List;

import com.example.tunehub.entity.Playlist;

public interface PlaylistService 
{

	public void addplaylsit(Playlist playlist);

	public List<Playlist> fetchAllPlaylist();
	
	

}
