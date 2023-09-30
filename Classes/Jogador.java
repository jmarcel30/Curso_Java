package Classes;

public class Jogador {
   private final int maxVidas =3;
   private int num =0;
   public int vidas = 0;
    
   // contrutor  
 public Jogador(int num){
   this.num = num;
   this.vidas = 1;
    System.out.printf("%nJogador %d criado%n",num);
     
 }
   public int getVidas(){
    return this.vidas;
   } 

   public void setVidas(int vidas){
    if( vidas > maxVidas){ 
      this.vidas = maxVidas;
   } else if(vidas < 0){
    this.vidas = 0;

   } else 
      this.vidas = vidas;
}
  