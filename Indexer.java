import java.util.ArrayList;

/**
 * Esta classe gerencia a indexaçao de arquivos de texto.
 * 
 * @author Joao dos Santos
 * @version 13/11/2017
 */
public class Indexer
{
    private FileProcessor processor;
    private ArrayList<String> inputFiles;
    
    /**
     * Gera um objeto.
     */
    public Indexer()
    {
        processor = new FileProcessor();
        inputFiles = new ArrayList<String>();
    }

    /**
     * @param fileName Adiciona o arquivo fileName na base de busca.
     */
    public void inputAdd(String fileName){
       inputFiles.add(fileName);
    }
    
    /**
     * @param fileName Remove o arquivo fileName da base de busca.
     */
    public void inputRemove(String fileName){
        inputFiles.remove(inputFiles.indexOf(fileName));
    }
    
    /**
     * 
     */
    public void print(){
        for(String input : inputFiles)
            System.out.println(input);
    }
    
    public void update(){
        processor.update((String [])inputFiles.toArray());
    }
}
