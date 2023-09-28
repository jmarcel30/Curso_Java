package Classes;

public class Jogador {

   private int num =0;
   public int vidas = 0;
    
   // contrutor  
 public Jogador(int num){
   this.num = num;
   this.vidas = 3;
    System.out.printf("%nJogador %d criado%n",num);
    System.out.println(vidas);
 }

}
  