package br.com.imd.dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Class for to realize the file management system 
 */

public class FileManagementSystem {
	
	private ArrayList<File> files; // List of files
	
	/**
	 * Constructor Default of the class 
	 */
	public FileManagementSystem(){
		files = new ArrayList<File>();
	}
	
	/**
	 * Method for to insert file in list of files
	 * 
	 * @param nameFile the file name
	 */
	public void insertFile(String nameFile){
		
		File file = new File(nameFile);
		
		try{
			BufferedReader read = new BufferedReader(new FileReader(nameFile));
			String line = read.readLine();
			int numLine = 1;
			
			while(line != null){
				line = read.readLine();
				file.addLine(line);
				numLine++;
			}
//			file.setLineQuantity(numLine);
//			file.setWordQuantity(numWord);
			files.add(file);
		} 
		catch(IOException e){
			System.err.printf("Erro na abertura do arquivo" + file.getNameFile());
		}
	}
	
	/**
	 * Method for to remove file in list of files 
	 * 
	 * @param nameFile the file name
	 */	
	public void removeFile(String nameFile){
		for(File file: files){
			if(file.getNameFile().equals(nameFile))
				files.remove(nameFile);
		}
	}
	
	/**
	 * 
	 * Method for to list all files presents in list of files 
	 * 
	 */		
	public void listFiles(){
		for(File file: files)
			System.out.println(file.getNameFile());
	}
	
	
	/**
	 * Method for to print the informations of the files
	 */
	public void print(){
		int count = 0;
		
		while(count < files.size()){
			System.out.println(files.get(count));
			ArrayList<String> lines = files.get(count).getLines();
			for(String line : lines) {
				System.out.println(line);
			}
			count++;
		}
	}
	
}
