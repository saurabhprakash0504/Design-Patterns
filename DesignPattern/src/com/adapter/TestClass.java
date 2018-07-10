package com.adapter;

public class TestClass {

	public static void main(String[] args) {
		AudioPlayer audioPlayer=new AudioPlayer();
		audioPlayer.play("chaiya chaiya", "MP4");
		audioPlayer.play("Dont be shy", "VLC");
		audioPlayer.play("Rock On", "avi");
	}
}
