package com.adapter;

public class MP4Player implements AdvancedMediaPlayer {

	@Override
	public void playMP4(String songName) {
		System.out.println("MP4 song Playing >>> " + songName);
	}

	@Override
	public void playVlc(String songName) {
	}

}
