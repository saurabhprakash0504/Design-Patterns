package com.adapter;

public class VLCPlayer implements AdvancedMediaPlayer{

	@Override
	public void playMP4(String songName) {
	}

	@Override
	public void playVlc(String songName) {
		System.out.println("VLC song Playing >>>> "+songName);
	}

}
