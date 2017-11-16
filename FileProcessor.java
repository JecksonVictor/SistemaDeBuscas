import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


/**
 * Esta classe e responsavel por processar os arquivos de entrada e persistir em arquivo a base
 * a base de dados para pesquisas. Esta classe tambem mantem uma estrutura de memoria para pesquisas.
 * @author Joao dos Santos
 * @version 15/11/2017
 */
public class FileProcessor
{
    private FileWriter inputFile;
    private BlackList badWords;
    private AVLTree dataBase;
    
    /**
     * COnstrutor para objetos da classe FileProcessor
     */
    public FileProcessor(){
        badWords = new BlackList();
    }
    
    /**
     * Carrega a blacklist de um arquivo.
     */
    public void loadBlackList(){
        try{
            BufferedReader file = new BufferedReader(new FileReader("teste.txt"));
            String word = file.readLine();
            while(word != null){
                badWords.add(word);
                word = file.readLine();
            }
            file.close();
            badWords.print();
        }catch(IOException e){
            System.out.println("Erro na abertura do arquivo");
        }
    }
    
    public void update(String [] inputFiles){
        for(String file: inputFiles){}
    }
}
