package com.adapter;

public class AudioPlayer implements MediaPlayer {

	@Override
	public void play(String songName, String songType) {
		if (songType.equals("MP4") || songType.equals("VLC")) {
			MediaAdapter adapter = new MediaAdapter(songType);
			adapter.play(songName, songType);
		} else {
			System.out.println("Not a valid audio type ");
		}
	}

}
