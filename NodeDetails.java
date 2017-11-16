/**
 * Esta classe armazena os dados da localizaçao de uma palavra. 
 * @author Joao Santos 
 * @version 14/11/2017
 */
public class NodeDetails{
    private String fileName;
    private int line;
    private int occurence;

    /**
     * Cria os dados de localizaçao de uma palavra.
     * @param fileName Nome do Arquivo onde a palavra foi localizada.
     * @param line Numero da linha do arquivo onde a palavra foi localizada.
     * @param occurence Quantidade de vezes que a palavra aparece na linha.
     */
    public NodeDetails(String fileName, int line, int occrence){
        this.fileName = fileName;
        this.line = line;
        this.occurence = occurence;
    }
    
    /**
     * @return Retorna o nome do arquivo onde a palavra foi localizada.
     */
    public String getFileName(){
        return fileName;
    }
    
    /**
     * @return Retorna o numero da linha do arquivo onde a palavra foi localizada.
     */
    public int getLine(){
        return line;
    }
    
    /**
     * @return Retorna a quantidade de ocorrencias da palavra em uma linha.
     */
    public int getOccurence(){
        return occurence;
    }
    
    /**
     * @param fileName Registra o nome do arquivo onde foi encontrada a palavra.
     */
    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    
    /**
     * @param line Registra a linha do arquivo onde a palavra foi localizada.
     */
    public void setLine(int line){
        this.line = line;
    }
    
    /**
     * @param occurence Registra a quantidade de vezes que a palavra aparece em uma lina do arquivo.
     */
    public void setOccurence(int occurence){
        this.occurence = occurence;
    }
    
    /**
     * @return Retorna uma string com os detalhes de arquivo, linha e ocorrencias.
     */
    public String toString(){
        String msg = getFileName() + ": ";
        msg += getLine() + ",";
        msg += getOccurence() + "\n";
        return msg;
    }
}