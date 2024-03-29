package com.tunehub.service;

import java.util.List;

import com.tunehub.entity.Song;

public interface SongService {

	boolean songExists(String name);

	void addSong(Song song);

	List<Song> fetchAllSongs();

	List<Song> searchSongs(String keyword);

	void updateSong(Song song);

	Song getSongById(int songId);

	void deleteSong(int songId);
	
}
