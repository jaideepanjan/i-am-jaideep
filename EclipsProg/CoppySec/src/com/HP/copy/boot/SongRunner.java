package com.HP.copy.boot;
import com.HP.copy.thing.*;

public class SongRunner {

	public static void main(String[] args) {
		
		Song nam = new Song();
		Song lan = new Song();
		Song sing = new Song();
		Song typ = new Song();
		Song com = new Song();
		Song mov = new Song();
		Song yer = new Song(); 
		
		System.out.println("Before initialising data we get defaul value ");
		System.out.println("The name of the song is ; "+nam.name);
		System.out.println("Language of the song : "+lan.language);
		System.out.println("The song sung by : "+sing.singer);
		System.out.println("The type of song is : "+typ.type);
		System.out.println("The song is Composed by : "+com.composer);
		System.out.println("Movei of the song is : "+mov.movie);
		System.out.println("Released on the year : "+yer.year);
		nam.name="Ra Ra Rakkamma";
		lan.language="Kannada";
		sing.singer="Sunidhi Chauhan";
		typ.type="Item Song";
		mov.movie="Vikranth Rona";
		yer.year=2022;
		
		System.out.println("After initialising Data ");
		System.out.println("The name of the song is ; "+nam.name);
		System.out.println("Language of the song : "+lan.language);
		System.out.println("The song sung by : "+sing.singer);
		System.out.println("The type of song is : "+typ.type);
		System.out.println("The song is Composed by : "+com.composer);
		System.out.println("Movei of the song is : "+mov.movie);
		System.out.println("Released on the year : "+yer.year);
		
		lan.language="Hindi";
		System.out.println("After initialising Data updating/reinitialising data");
		System.out.println("The name of the song is ; "+nam.name);
		System.out.println("Language of the song : "+lan.language);
		System.out.println("The song sung by : "+sing.singer);
		System.out.println("The type of song is : "+typ.type);
		System.out.println("The song is Composed by : "+com.composer);
		System.out.println("Movei of the song is : "+mov.movie);
		System.out.println("Released on the year : "+yer.year);
		

	}

}
