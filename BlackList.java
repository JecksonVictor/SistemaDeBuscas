import java.util.HashSet;

/**
 * Esta classe armazena as palavra proibidas ou sem significaçao.
 * @author Joao dos Santos
 * @version 16/11/2017
 */
public class BlackList{
   private HashSet<String> badWords;
   
   public BlackList(){
       badWords = new HashSet<String>();
   }
   
   public void add(String word){
       badWords.add(word);
   }
   
   public void remove(String word){
       badWords.remove(word);
   }
   
   public boolean contains(String word){
       return badWords.contains(word);
   }
   
   public void print(){
       for(String word : badWords){
           System.out.println(word);
           System.out.println();
        }
   }
}
