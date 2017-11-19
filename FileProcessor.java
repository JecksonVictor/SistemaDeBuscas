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
        loadBlackList();
    }
    
    public void loadFile(String fileName){
        try{
            BufferedReader file = new BufferedReader(new FileReader(fileName));
            String line = file.readLine();
            int numLine = 1;
            
            while(line != null){
                String [] words = line.split(" ");
                
                for(String word : words){
                    if(!badWords.contains(word) && !word.equals("")){
                        WordProcessor processor = new WordProcessor(word);
                        System.out.println(fileName + ": " + processor.prepareWord() + " - linha: " + numLine);
                    }
                }
                line = file.readLine();
                numLine++;
            }
            file.close();
        }
        catch(IOException e){
            System.out.println("Erro no carregamento do arquivo" + fileName);
        }
    }
    
    /**
     * Carrega a blacklist de um arquivo.
     */
    private void loadBlackList(){
        try{
            BufferedReader file = new BufferedReader(new FileReader("blacklist.txt"));
            String word = file.readLine();
            while(word != null){
                badWords.add(word);
                word = file.readLine();
            }
            file.close();
            //badWords.print();
        }catch(IOException e){
            System.out.println("Erro na abertura do arquivo");
        }
    }
    
    public void update(String [] inputFiles){
        for(String file: inputFiles){}
    }
    
    public class WordProcessor{
        private String word;
        private final char [] sequence = {'.', ',', ';', ':', '?', '!', '(', ')', '[', ']', '\'', '\"', '\\', ' '};
        
        public WordProcessor(String word){
            this.word = word;
        }
        
        public String prepareWord(){
            if(word.equals(" ")) return "";
            word = word.trim();
            word = word.toLowerCase();
            for(char caracter : sequence){
                word = word.replace(caracter, '\0');
            }
            return word;
        }
    }
}
