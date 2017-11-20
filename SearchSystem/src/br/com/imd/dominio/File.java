package br.com.imd.dominio;
import java.util.ArrayList;

/**
 * Class for to represent a file in system 
 */
public class File {
	
	private String nameFile;		// variable for file name
	private int lineQuantity;		// variable for the line quantity
	private int wordQuantity;		// variable for word quantity
	private ArrayList<String> lines;// list of lines
	
	/**
	 * Constructor parameterized
	 */
	public File(String nameFile){
		this.nameFile = nameFile;
		this.lineQuantity = 0;
		this.wordQuantity = 0;
		this.lines = new ArrayList<String>();
	}
	
	/**
	 * Method for to add the lines iin list of lines
	 * 
	 * @param line the line for add in list of lines
	 */
	public void addLine(String line){
		lines.add(line);
		lineQuantity++;
	}

	/**
	 * @return the nameFile
	 */
	public String getNameFile() {
		return nameFile;
	}

	/**
	 * @param nameFile the nameFile to set
	 */
	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	/**
	 * @return the lineQuantity
	 */
	public int getLineQuantity() {
		return lineQuantity;
	}

	/**
	 * @param lineQuantity the lineQuantity to set
	 */
	public void setLineQuantity(int lineQuantity) {
		this.lineQuantity = lineQuantity;
	}

	/**
	 * @return the wordQuantity
	 */
	public int getWordQuantity() {
		return wordQuantity;
	}

	/**
	 * @param wordQuantity the wordQuantity to set
	 */
	public void setWordQuantity(int wordQuantity) {
		this.wordQuantity = wordQuantity;
	}

	/**
	 * @return the lines
	 */
	public ArrayList<String> getLines() {
		return lines;
	}

	/**
	 * @param lines the lines to set
	 */
	public void setLines(ArrayList<String> lines) {
		this.lines = lines;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString(){
		String temp = "\nNome do arquivo: " + this.nameFile
				+ "\nQtd linhas: " + this.lineQuantity 
				+ "\nQtd palavras: " + this.wordQuantity;

		return temp;
	}
		
}
