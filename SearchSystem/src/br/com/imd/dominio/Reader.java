package br.com.imd.dominio;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Reader {
	
	private String word;
	private final char[] sequence = {'.', ',', ';', ':', '?', '!', '(', ')', '[', ']', '\'', '\"', '\\', ' '};
	
	public Reader(){
		this.word = null;
	}

	/**
	 * Method for to prepare the words
	 * 
	 * @param word	 
	 * @return word	 returned  
	 */
	public String prepareWord(String word){
		if(word.equals(" ")) return "";
		word = word.trim();
		word = word.toLowerCase();
		for(char caracter : sequence)
			word = word.replace(caracter, '\0');
		return word;
	}
	
}
