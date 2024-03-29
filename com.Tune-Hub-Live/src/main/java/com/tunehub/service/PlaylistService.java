package com.tunehub.service;

import java.util.List;

import com.tunehub.entity.Playlist;
import com.tunehub.entity.User;

public interface PlaylistService {

	void deletePlaylist(int playlistId);				// Method signature to delete a playlist by its ID

	void addPlaylist(Playlist playlist, User user);		// Method signature to add a playlist associated with a user

	List<Playlist> fetchPlaylistsByUser(User user);		// Method signature to fetch playlists by user
	
}
