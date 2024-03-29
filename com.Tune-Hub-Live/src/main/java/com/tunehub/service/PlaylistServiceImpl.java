package com.tunehub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.entity.Playlist;
import com.tunehub.entity.User;
import com.tunehub.repository.PlaylistRepository;

@Service
public class PlaylistServiceImpl implements PlaylistService {
	 @Autowired
	    public PlaylistRepository playlistRepository;

	@Override
	public void addPlaylist(Playlist playlist,User user ) {
		playlist.setUser(user); 							// Associate the playlist with the provided user
		playlistRepository.save(playlist);					// Save the playlist to the database
		
	}

	@Override
    public void deletePlaylist(int playlistId) {
        playlistRepository.deleteById(playlistId);			// Delete the playlist by its ID
    }


	@Override
	public List<Playlist> fetchPlaylistsByUser(User user) {
		return playlistRepository.findByUser(user);			// Fetch playlists associated with the provided user
	}   
}
