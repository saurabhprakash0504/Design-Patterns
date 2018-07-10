package com.adapter;

public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer advancedMediaPlayer;

	MediaAdapter(String songType) {
		if(songType.equals("VLC")) {
			advancedMediaPlayer=new VLCPlayer();
		}
		else if(songType.equals("MP4")) {
			advancedMediaPlayer=new MP4Player();
		}
	}

	@Override
	public void play(String songName, String songType) {
		if(songType.equals("VLC")) {
			advancedMediaPlayer.playVlc(songName);
		}
		else if(songType.equals("MP4")) {
			advancedMediaPlayer.playMP4(songName);
		}
	}
}
