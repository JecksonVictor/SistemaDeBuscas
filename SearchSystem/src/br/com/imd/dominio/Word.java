package br.com.imd.dominio;

/**
 * Class for to represent a word
 */
public class Word {
	
	private String nameWord;
	private String nameFile;
	private int line;
	
	
	/**
	 * Constructor parameterized
	 */
	public Word(String nameWord, String nameFile, int line){
		this.nameWord = nameWord;
		this.nameFile = nameFile;
		this.line = line;
	}

	/**
	 * @return the nameWord
	 */
	public String getNameWord() {
		return nameWord;
	}

	/**
	 * @param nameWord the nameWord to set
	 */
	public void setNameWord(String nameWord) {
		this.nameWord = nameWord;
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
	 * @return the line
	 */
	public int getLine() {
		return line;
	}

	/**
	 * @param line the line to set
	 */
	public void setLine(int line) {
		this.line = line;
	}
	
	
}
