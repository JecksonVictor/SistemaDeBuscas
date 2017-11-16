
/**
 * Escreva a descrição da classe Tree aqui.
 * @author Joao dos Santos
 * @version 15/11/2017
 */
public class AVLTree{
    private Node root;
    private AVLTree SAE;
    private AVLTree SAD;
    /**
     * Este construtor gera uma arvore vazia.
     */
    public AVLTree(String key){
        root = ;
    }

    public Node search(String key){
        Node node = root;
        while(node != null){
            if(key.compareTo(node.getKey()) == 0) return node;
            else if(key.compareTo(node.getKey()) > 0) node = node.getLeftNode();
            else if(key.compareTo(node.getKey()) < 0) node = node.getRightNode();
        }
        return null;
    }
    
    public void add(String word, NodeDetails detail, Node node){
        if(node == null) node = new Node(word);
        else if(word.compareTo(node.getKey()) > 0) add(word, detail, node.getLeftNode());
        else if(word.compareTo(node.getKey()) < 0) add(word, detail, node.getRightNode());
        else if(word.compareTo(node.getKey()) == 0) node.addNodeDetails(detail);
    }
    
    /**
     * @return Retorna verdadeiro de a arvore estiver vazia e falso em caso contrario.
     */
    public boolean isEmpty(){
        return (root == null)? true : false;
    }
    
}
