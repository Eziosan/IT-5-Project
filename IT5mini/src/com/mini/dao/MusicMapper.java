package com.mini.dao;

import java.util.ArrayList;

import com.mini.vo.Singer;
import com.mini.vo.Song;

public interface MusicMapper {
	
	//가수로 노래찾기
	public ArrayList<Song> searchMusicBySinger(String singer);
		
	//노래로 노래찾기
	public ArrayList<Song> searchMusicByName(String song);	
	
	//가사로 노래찾기
	public ArrayList<Song> musicByLyric(String lyrics);
	
	//찾아온 노래중에 id를 통해서 노래 선택
	public Song showSong(int song_id);

	//가수 이름으로 가수 리스트 불러오기
	public ArrayList<Singer> getSingersByName(String singer);
	
	//singer테이블에서 현재 시퀀스 값 가져오기
	public int getSingerSeq();

	//가수 등록
	public int addSinger(Singer singer);
	
	//곡 등록
	public int enroll(Song song);
}