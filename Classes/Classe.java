package Classes;

public class Classe {
    public static void main(String[] args) {
        
        int num =   0;  
        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num); 
       j1.setVidas(100);
       System.out.printf("%nVidas do jogador 1:%d",j1.getVidas());
       System.out.printf("%nVidas do jogador 1:%d",j2.getVidas());
       System.out.printf("%nVidas do jogador 1:%d",j3.getVidas());
        
        // j1.num = 10;

        //  System.out.println(j1.num);  

     



       }
}
