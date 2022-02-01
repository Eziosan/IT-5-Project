package com.mini.control;

import java.util.ArrayList;

import com.mini.dao.*;
import com.mini.vo.*;

public class MusicController {
	
	MusicDAO md = new MusicDAO();
	

		
		//만약에 hashmap으로 <int, Song>???
		//사용자가 입력한 노래가 포함된 노래 리스트 가져오기
		public ArrayList<Song> selectMusicsBySinger(Singer singer) {
		//가수 이름으로 가수 리스트가져오기
		ArrayList<Song> Song = md.selectMusicsBySinger(singer);
		
		return Song;
		}
		
		// 노래 제목으로 노래리스트 출력
		public ArrayList<Song> searchMusicByName(String song) {
			
		//노래 가져오기
		ArrayList<Song> songList = md.searchMusicByName(song);
		//사용자 선택
		//해당 곡 가져오기(곡 id로)
		return songList;
		}
	
		// 별점 입력
		public void insertStar(Song song) {
			song.setStar_counter(song.getStar_counter() + 1);
//			System.out.println("입력한 수 : " + song.getStar_counter());
			md.insertStar(song);
		}
		
		// 코멘트 입력
		public void insertComment(SongComment SC) {
			md.insertComment(SC);
			
		}
		
		// 코멘트 출력
		public ArrayList<SongComment> selectCommentBySongId(int sid) {

			
			return md.selectCommentBySongId(sid);
		}
		
}