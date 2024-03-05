package com.example.tunehub.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tunehub.entity.Playlist;
import com.example.tunehub.entity.Song;
import com.example.tunehub.repository.PlaylistRepository;
import com.example.tunehub.service.PlaylistService;
@Service
public class PlaylistServiceImpl implements PlaylistService 
{
	@Autowired
	PlaylistRepository playlistRepo;

@Override
	public void addplaylsit(Playlist playlist)
	{
		playlistRepo.save(playlist);
	}

@Override
	public List<Playlist> fetchAllPlaylist() 
	{
		List<Playlist> allplaylist =playlistRepo.findAll();
	
		return allplaylist ;
	}


	
}
