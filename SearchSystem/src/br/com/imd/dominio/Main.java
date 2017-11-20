package br.com.imd.dominio;

public class Main {

	public static void main(String[] args) {
		
		FileManagementSystem system = new FileManagementSystem();
		system.insertFile("data/apple.txt");
		system.insertFile("data/google.txt");
		system.insertFile("data/microsoft.txt");
		system.print();
		
	}

}
