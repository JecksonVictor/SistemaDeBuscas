import java.util.ArrayList;
/**
 * Esta classe representa um no e armazena os dados de localizacao de uma palavra;
 * @author Joao Santos
 * @version 13/11/2017
 */
public class Node{
    private String key;
    private ArrayList<NodeDetails> details;
    private Node leftNode;
    private Node rightNode;
    
    /**
     * 
     */
    public Node(String key){
        this.key = key;
        details = new ArrayList<NodeDetails>();
        leftNode = null;
        rightNode = null;
    }
    
    /**
     * Cria um novo no.
     * @param key E a palavra que e usada para indexar a busca.
     * @param fileName Arquivo de origem da palavra.
     * @param line Linha do arquivo onde a palavra esta.
     * @param occurence Quantidades de vezes que a palavra aparece em uma linha.
     */
    public Node(String key, String fileName, int line, int occurence){
        this.key = key;
        details = new ArrayList<NodeDetails>();
        details.add(new NodeDetails(fileName, line, occurence));
        leftNode = null;
        rightNode = null;
    }

    /**
     * @return Retorna a palavra que e a chave do no.
     */
    public String getKey(){
        return key;
    }
    
    /**
     * @return Retorna uma string com os detalhes do no.
     */
    public void print(){
        for(NodeDetails detail : details)
            System.out.println(key + details.toString());
    }
    
    public void addNodeDetails(NodeDetails detail){
        details.add(detail);
    }
    
    public Node getLeftNode(){
        return leftNode;
    }
    
    public Node getRightNode(){
        return rightNode;
    }
}